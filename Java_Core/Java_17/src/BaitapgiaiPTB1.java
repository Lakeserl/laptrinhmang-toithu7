import java.util.Scanner;

public class BaitapgiaiPTB1 {
    public static void main(String[] args) {
       double a, b, x = 0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = sc.nextDouble();
        System.out.println("Nhập b = ");
        b = sc.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            } else if(b != 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        } else if (a != 0) {
            System.out.println("x = " + (x = -b/a));
        }
        else {
            System.out.println("Phương trình không thể được thực thi");
        }
    }
}
