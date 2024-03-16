import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các bộ phim
        List<Phim> danhSachPhim = new ArrayList<>();

        // Thêm một số bộ phim vào danh sách
        danhSachPhim.add(new Phim("Người vận chuyển", "Louis Leterrier", 2002));
        danhSachPhim.add(new Phim("Thần thoại", "Zack Snyder", 2010));
        danhSachPhim.add(new Phim("Hội quán tiếu lâm", "Stephen Chow", 2004));

        // Hiển thị thông tin về các bộ phim trong danh sách
//        System.out.println("Các bộ phim:");
//        for (Phim phim : danhSachPhim) {
//            System.out.println(phim);
//        }

        // Xóa một bộ phim khỏi danh sách
//        Phim phimCanXoa = new Phim("Thần thoại", "Zack Snyder", 2010);
//        danhSachPhim.remove(phimCanXoa);

        // Hiển thị thông tin về các bộ phim sau khi xóa
//        System.out.println("\nCác bộ phim sau khi xóa:");
//        for (Phim phim : danhSachPhim) {
//            System.out.println(phim);
//        }
    }
}
