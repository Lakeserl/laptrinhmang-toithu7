package Java_Core.Java_23.src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while (x != 0) {
            System.out.println("Nhap x = 0 de thoat; Nhap ky tuc khac de tiep tuc:");
            x = sc.nextInt();
        }

        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 10)
                break;
        }
    }
}