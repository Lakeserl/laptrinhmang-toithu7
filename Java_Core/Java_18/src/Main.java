import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        char Continue;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập a = ");
            a = sc.nextDouble();
            System.out.println("Nhập b = ");
            b = sc.nextDouble();
            System.out.println("NHập c = ");
            c = sc.nextDouble();
            delta = Math.pow(b, 2) - 4 * a * c;

            if (a == 0) {
                System.out.println("Phương trình không tồn tại");
            } else {
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta == 0) {
                    System.out.println("Phương trình có 1 nghiệm kép");
                } else if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / 2 * a;
                    x2 = (-b - Math.sqrt(delta)) / 2 * a;
                    System.out.println("Phương trình có 2 nghiệm phân biệt:\n x1 = " + x1 + "\nx2 = " + x2);
                }
            }

            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            Continue = sc.next().charAt(0);
        }while (Continue == 'Y' || Continue == 'y');

        System.out.println("Kết thúc chương trình.");
    }
}