package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 25000);
             BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Đã kết nối đến máy chủ");
            System.out.println("-------------------------");
            System.out.println("Nhập 'exit' để thoát");

            // Tạo một luồng đọc dữ liệu từ server
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

            // Gửi tin nhắn từ client tới server
            String input;
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                pw.println("Client: " + input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
