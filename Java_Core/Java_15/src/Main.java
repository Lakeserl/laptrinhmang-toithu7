package Java_Core.Java_15.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a= ");
        int a = sc.nextInt();

        String ketQua = (a%2==0) ? "số chẵn" : "Số lẻ";
        System.out.println(a + " là "+ ketQua);
    }
}