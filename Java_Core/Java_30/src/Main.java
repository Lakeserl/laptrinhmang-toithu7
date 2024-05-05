package Java_Core.Java_30.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int d;
        MyDate md = new MyDate(25, 2, 2029);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDate();
    }
}