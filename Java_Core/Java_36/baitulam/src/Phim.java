public class Phim {
    private String tieuDe;
    private String daoDien;
    private int namPhatHanh;

    public Phim(String tieuDe, String daoDien, int namPhatHanh) {
        this.tieuDe = tieuDe;
        this.daoDien = daoDien;
        this.namPhatHanh = namPhatHanh;
    }

    // Các phương thức getter và setter
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(int namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    @Override
    public String toString() {
        return "Phim{" +
                "tieuDe='" + tieuDe + '\'' +
                ", daoDien='" + daoDien + '\'' +
                ", namPhatHanh=" + namPhatHanh +
                '}';
    }
}
