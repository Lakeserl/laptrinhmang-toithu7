package client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat2 {
    public static void main(String[] args) {
        try {
            // Kết nối tới server trên cổng 25000
            Socket client = new Socket("192.168.2.37", 25000);
            System.out.println("Đã kết nối đến máy chủ");

            // Tạo luồng để nhận dữ liệu từ server
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // Tạo luồng để gửi dữ liệu tới server
            PrintWriter clientOutput = new PrintWriter(client.getOutputStream(), true);

            // Gửi câu xin chào & ghi thông tin
            clientOutput.println("Client: Xin chào, tôi là là Client");

            System.out.println("-------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập 'exit' để thoát");
            System.out.println("Nhập nội dung tin nhắn để gửi thông tin đến server");
            String serverResponse;
            while (true) {
                // Đọc dữ liệu từ server và hiển thị trên màn hình
                serverResponse = serverInput.readLine();
                if (serverResponse == null) {
                    // Server đã đóng kết nối
                    break;
                }
                System.out.println(serverResponse);

                // Đọc tin nhắn từ người dùng và gửi đến server
                String userInput = scanner.nextLine();
                if (userInput.equals("exit")) {
                    break;
                }
                clientOutput.println("Client: " + userInput);
            }

            // Đóng kết nối
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
