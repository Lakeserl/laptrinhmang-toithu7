package main;

import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class MiniGameTaiXiu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        int soTienBanDau = 1000;
        int soLanChoi = 0;

        while (soTienBanDau > 0) {
            System.out.println("\nBạn có " + currencyFormat.format(soTienBanDau) + " để cược.");
            System.out.print("Nhập số tiền bạn muốn cược: ");
            int soTienCuoc = scanner.nextInt();
            if (soTienCuoc <= 0 || soTienCuoc > soTienBanDau) {
                System.out.println("Số tiền cược không hợp lệ.");
                continue;
            }

            System.out.println("1. Tài");
            System.out.println("2. Xỉu");
            System.out.print("Chọn Tài hoặc Xỉu (1 hoặc 2): ");
            int luaChon = scanner.nextInt();
            if (luaChon != 1 && luaChon != 2) {
                System.out.println("Lựa chọn không hợp lệ.");
                continue;
            }

            int soXucXac1 = random.nextInt(6) + 1;
            int soXucXac2 = random.nextInt(6) + 1;
            int tongDiem = soXucXac1 + soXucXac2;

            System.out.println("Số xúc xắc 1: " + soXucXac1);
            System.out.println("Số xúc xắc 2: " + soXucXac2);
            System.out.println("Tổng điểm: " + tongDiem);

            if ((tongDiem >= 9 && luaChon == 1) || (tongDiem <= 6 && luaChon == 2)) {
                System.out.println("Chúc mừng! Bạn đã thắng.");
                soTienBanDau += soTienCuoc;
            } else {
                System.out.println("Rất tiếc! Bạn đã thua.");
                soTienBanDau -= soTienCuoc;
            }

            soLanChoi++;
        }

        System.out.println("Bạn đã hết tiền sau " + soLanChoi + " lượt chơi.");
    }
}
