//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        System.out.println("a = "+ a);
        System.out.println("b = " + b);

        float c = a;
        float d = a;

        System.out.println("c = "+ a);
        System.out.println("d = "+b);

        //Ép kiểu tường minh
        float e = 3.5f;
        float f = 9.5f;

        System.out.println("e = "+e);
        System.out.println("f = "+f);

        int g = (int)e;
        int h = (int)f;
        System.out.println("g = "+ g);
        System.out.println("f = "+ f);

        /*Ép kiẻu dữ liệu nguyên thủy ide của em không hỗ trơ ví nó đã bị loại bỏ từ Java 9
        int x = new Integer(32);
        System.out.println("x = "+x);
         */
    }
}