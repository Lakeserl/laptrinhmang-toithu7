package Java_Core.Java_20.src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap so nam");
        nam = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + thang + " nam "+ nam + " co" + " 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + thang + " nam "+ nam + " co" + " 30 ngay");
            case 2:
                if((nam % 400 == 0) || (nam % 100 != 0) && (nam % 4 == 0)) {
                    System.out.println("Thang 2 Nam "+nam+"co 29 ngay");
                }
                else {
                    System.out.println("Thang 2 Nam "+nam+"co 28 ngay");
                }
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}