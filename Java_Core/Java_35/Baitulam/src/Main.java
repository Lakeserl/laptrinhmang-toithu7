public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng thư viện
        Library library = new Library();

        // Thêm một số sách vào thư viện
        library.addBook(new Book("Và Rồi, Tháng 9 Không Có Cậu Đã Tới", "Amasawa Natsuki", "8936186543074", 296));
        library.addBook(new Book("Đám Trẻ Ở Đại Dương Đen", "Châu Sa Đáy Mắt", "9786043927344", 280));
        library.addBook(new Book("Sĩ Số Lớp Vắng 0", "Emma Hạ My", "9786044743578", 264));

        // Hiển thị tất cả các sách trong thư viện
//        System.out.println("Books in the library:");
//        library.displayBooks();

        // Xóa một cuốn sách khỏi thư viện
//        Book bookToRemove = new Book("Và Rồi, Tháng 9 Không Có Cậu Đã Tới", "Amasawa Natsuki", "8936186543074", 296);
//        library.removeBook(bookToRemove);

        // Hiển thị tất cả các sách trong thư viện sau khi xóa
//        System.out.println("\nBooks in the library after removing a book:");
//        library.displayBooks();
    }
}
