import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng");
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("Gia tri nhap la: "+n);
        System.out.println("Ket thuc chuong trinh");
    }
}