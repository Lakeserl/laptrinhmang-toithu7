import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();

        int sum = a + b;
        System.out.println(a +"+"+ b +"="+ sum );
        int sub = a - b;
        System.out.println(a + "-" + b +"= "+ sub);
        int mul = a * b;
        System.out.println(a + "*" + b +"= "+ mul);
        int dev = a / b;
        System.out.println(a + "/" + b +"= "+ dev);
        int surplus = a % b;
        System.out.println(a + "%" + b +"= "+ surplus);
    }
}