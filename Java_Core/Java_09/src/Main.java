import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String hoVaTen = sc.nextLine();

        System.out.println("Nhập mã sinh viên: ");
        long maSinhVien = sc.nextLong();

        System.out.println("Nhập điểm thi: ");
        float diemThi = sc.nextFloat();
        System.out.println("-------------------");
        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("-------------------");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("-------------------");
        System.out.println("Điểm thi: " + diemThi);
        System.out.println("--------------------");
    }
}