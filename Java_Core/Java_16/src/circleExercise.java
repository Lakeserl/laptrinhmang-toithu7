import java.util.Scanner;

public class circleExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Em muốn thử thêm những hình khác vào đây ngoài hình tròn ra(luyện thêm)
        int choice;
        do {
            System.out.println("CHọn hình :");
            System.out.println("1. Hình tròn");
            System.out.println("2.Hình vuông");
            System.out.println("3.Hình chữ nhật");
            System.out.println("4. Hình thoi");
            System.out.println("5.Hình thang");
            System.out.println("6.Hình bình hành");
            System.out.println("7.Hình tam giác thường");
            System.out.println("0. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                hinhTron();
                break;
                case 2:
                hinhVuong();
                break;
                case 3:
                hinhChuNhat();
                break;
                case 4:
                hinhThoi();
                break;
                case 5:
                hinhThang();
                break;
                case 6:
                hinhBinhHanh();
                break;
                case 7:
                hinhTamGiacThuong();
                break;
                case 0:
                System.out.println("Kết thúc chương trình.");
                break;
                default:
                    System.out.println("LKhông hợp lệ,Hãy chọn lại.");
            }
        } while (choice != 0);
    }

    public static void hinhTron() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        double r = sc.nextDouble();

        double chuVi = tinhChuViHinhTron(r);
        double dienTich = tinhDienTichHinhTron(r);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhTron(double r) {
        return 2 * Math.PI * r;
    }

    public static double tinhDienTichHinhTron(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void hinhVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = sc.nextDouble();

        double chuVi = tinhChuViHinhVuong(a);
        double dienTich = tinhDienTichHinhVuong(a);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhVuong(double a) {
        return 4 * a;
    }

    public static double tinhDienTichHinhVuong(double a) {
        return a * a;
    }

    public static void hinhChuNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap chieu rong b: ");
        double b = sc.nextDouble();

        double chuVi = tinhChuViHinhChuNhat(a, b);
        double dienTich = tinhDienTichHinhChuNhat(a, b);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhChuNhat(double a, double b) {
        return 2 * (a + b);
    }

    public static double tinhDienTichHinhChuNhat(double a, double b) {
        return a * b;
    }

    public static void hinhThoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap duong cheo chinh d1: ");
        double d1 = sc.nextDouble();
        System.out.println("Nhap duong cheo phụ d2: ");
        double d2 = sc.nextDouble();

        double chuVi = tinhChuViHinhThoi(d1);
        double dienTich = tinhDienTichHinhThoi(d1, d2);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhThoi(double d1) {
        return 4 * d1;
    }

    public static double tinhDienTichHinhThoi(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static void hinhThang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap day lon a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap day nho b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap chieu cao h: ");
        double h = sc.nextDouble();

        double chuVi = tinhChuViHinhThang(a, b, h);
        double dienTich = tinhDienTichHinhThang(a, b, h);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhThang(double a, double b, double h) {
        return a + b + 2 * Math.sqrt((Math.pow((a - b) / 2, 2)) + Math.pow(h, 2));
    }

    public static double tinhDienTichHinhThang(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void hinhBinhHanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap chieu cao h: ");
        double h = sc.nextDouble();

        double chuVi = tinhChuViHinhBinhHanh(a);
        double dienTich = tinhDienTichHinhBinhHanh(a, h);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhBinhHanh(double a) {
        return 2 * a;
    }

    public static double tinhDienTichHinhBinhHanh(double a, double h) {
        return a * h;
    }

    public static void hinhTamGiacThuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh c: ");
        double c = sc.nextDouble();

        double chuVi = tinhChuViHinhTamGiac(a, b, c);
        double dienTich = tinhDienTichHinhTamGiac(a, b, c);

        inKetQua(chuVi, dienTich);
    }

    public static double tinhChuViHinhTamGiac(double a, double b, double c) {
        return a + b + c;
    }

    public static double tinhDienTichHinhTamGiac(double a, double b, double c) {
        double p = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Sử dụng công thức Heron
    }

    public static void inKetQua(double chuVi, double dienTich) {
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Chu vi (làm tròn) = " + Math.round(chuVi));
        System.out.printf("Chu vi (làm tròn 2 chữ số thập phân) = %.2f%n", chuVi);

        System.out.println("Dien tich = " + dienTich);
        System.out.println("Dien tich (làm tròn) = " + Math.round(dienTich));
        System.out.printf("Dien tich (làm tròn 2 chữ số thập phân) = %.2f%n", dienTich);
    }
}