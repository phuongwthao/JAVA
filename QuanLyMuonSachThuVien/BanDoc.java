package QuanLyMuonSachThuVien;

public class BanDoc {
    private static int cnt = 10000;
    private int id;
    private String name;
    private String add;
    private String phonenumber;
    private String type;

    public BanDoc(String name, String add, String phonenumber, String type) {
        this.id = cnt;
        this.name = name;
        this.add = add;
        this.phonenumber = phonenumber;
        this.type = type;
        cnt++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id +"_"+this.name+"_"+this.add+"_"+this.phonenumber+"_"+this.type;
    }

    public String getName() {
        return name;
    }
}
