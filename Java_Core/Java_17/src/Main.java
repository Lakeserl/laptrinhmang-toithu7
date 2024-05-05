package Java_Core.Java_17.src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyn n = ");
        n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("N là số chẵn");
        }else {
            System.out.println("N là số lẻ");
        }
    }
}