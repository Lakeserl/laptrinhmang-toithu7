package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerChat {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        try (ServerSocket server = new ServerSocket(25000)) {
            System.out.println("Server đang chạy tại port: 25000");

            while (true) {
                Socket connection = server.accept();
                System.out.println("Chấp nhận kết nối từ client");

                // Mở một luồng mới để xử lý kết nối với client
                executorService.submit(new ClientHandler(connection));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}

class ClientHandler implements Runnable {
    private final Socket connection;

    ClientHandler(Socket connection) {
        this.connection = connection;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("-------------------------");
            System.out.println("Nhập 'exit' để thoát");

            // Tạo một luồng đọc dữ liệu từ client
            Thread readerThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = br.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            readerThread.start();

            // Gửi tin nhắn từ server tới client
            String input;
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                pw.println("Server: " + input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
