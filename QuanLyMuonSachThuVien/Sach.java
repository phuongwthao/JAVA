package QuanLyMuonSachThuVien;

public class Sach {
    private static int cnt = 10000;
    private int id;
    private String name;
    private String author;
    private String major;
    private int year;

    public Sach(String name, String author, String major, int year) {
        this.id = cnt;
        this.name = name;
        this.author = author;
        this.major = major;
        this.year = year;
        cnt++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id + "_"+this.name+"_"+this.author+"_"+this.year;
    }

    public String getName() {
        return name;
    }
}
