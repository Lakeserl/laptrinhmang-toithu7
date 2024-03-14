import java.io.File;
import java.io.IOException;

public class CreateFileAndDirectory {
    public static void main(String[] args) {
        String directoryPath = "D:\\temple";

        try {
            File directory = new File(directoryPath);

            if (!directory.exists()) {
                createDirectory(directory);
            } else {
                System.out.println("Thư mục đã tồn tại: " + directory.getCanonicalPath());
            }

            String filePath = directoryPath + File.separator + "docs.txt";
            File file = new File(filePath);

            if (!file.exists()) {
                createFile(file);
            } else {
                System.out.println("Tập tin đã tồn tại: " + file.getCanonicalPath());
            }
            if (directory.exists() && !isSystemDrive(directory)) {
                deleteDirectory(directory);
            } else {
                System.out.println("Không thể xóa thư mục.");
            }
            // Xóa thư mục nếu cần
            deleteDirectory(directory);
        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi tạo thư mục hoặc tập tin: " + e.getMessage());
        }
    }

    private static boolean isSystemDrive(File directory) {
        String driveLetter = directory.getAbsolutePath().substring(0, 2);
        return driveLetter.equalsIgnoreCase("C:") || driveLetter.equalsIgnoreCase("D:");
    }

    private static void createDirectory(File directory) throws IOException {
        if (directory.mkdirs()) {
            System.out.println("Thư mục đã được tạo thành công: " + directory.getCanonicalPath());
        } else {
            throw new IOException("Không thể tạo thư mục.");
        }
    }

    private static void createFile(File file) throws IOException {
        if (file.createNewFile()) {
            System.out.println("Tạo tập tin thành công: " + file.getCanonicalPath());
        } else {
            throw new IOException("Không thể tạo tập tin.");
        }
    }

    private static void deleteDirectory(File directory) throws IOException {
        if (directory.exists()) {
            if (directory.isDirectory()) {
                // Xóa tất cả các tệp và thư mục con trong thư mục hiện tại trước
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        deleteDirectory(file);
                    }
                }
            }
            // Xóa thư mục hiện tại
            if (!directory.delete()) {
                throw new IOException("Không thể xóa thư mục.");
            }
            System.out.println("Thư mục đã được xóa thành công: " + directory.getCanonicalPath());
        } else {
            System.out.println("Thư mục không tồn tại: " + directory.getCanonicalPath());
        }
    }
}
