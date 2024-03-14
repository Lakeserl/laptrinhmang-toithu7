import java.io.File;
import java.text.SimpleDateFormat;

public class taoCayThuMuc {
    public static void main(String[] args) {
        String directoryPath = "D:\\data";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            displayDirectoryDetails(directory, 0);
        } else {
            System.out.println("Thư mục không tồn tại hoặc không phải là thư mục.");
        }
    }

    private static void displayDirectoryDetails(File directory, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("    ");
        }

        System.out.println(indent + "|__ " + directory.getName() + " (Folder)");

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(indent + "    |__  " + file.getName() + " (Folder)");
                        displayDirectoryDetails(file, depth + 1);
                    } else {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        System.out.println(indent + "    |__  " + file.getName() + " (File)");
                        System.out.println(indent + "        |   Path: " + file.getAbsolutePath());
                        System.out.println(indent + "        |   Size: " + file.length() + " bytes");
                        System.out.println(indent + "        |   Last Modified: " + sdf.format(file.lastModified()));
                    }
                }
            }

            //Kiểm tra thông tin file/fould
            //Tạo, kiểm tra, tự động chỉnh sửa chính tả, kiểm lỗi,
        }
    }
}
