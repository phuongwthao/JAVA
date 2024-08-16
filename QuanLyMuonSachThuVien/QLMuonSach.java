package QuanLyMuonSachThuVien;

public class QLMuonSach {
    private BanDoc bandoc;
    private Sach[] sachs;
    private int[] soluongtheodausach;
    private int sodausach;
    private int tongsoluong;


    public QLMuonSach(BanDoc bandoc) {
        this.bandoc = bandoc;
        this.sachs = new Sach[6];
        this.soluongtheodausach = new int[6];
        this.sodausach = 0;
        this.tongsoluong = 0;
    }
    public void muonsach(Sach sach , int soluongmuon){
        if(soluongmuon>3){
            System.out.println("Moi dau sach khong duoc muon qua 3 cuon");
            return;
        }
        if(tongsoluong>5){
            System.out.println("Khong duoc phep muon qua 5 dau sach khac nhau");
            return;
        }
        int kt = 0;
        for(int i=1; i<=sodausach;i++){
            if(sach.equals(sachs[i])){
                this.soluongtheodausach[i]+=soluongmuon;

                kt=1;
                break;
            }
        }
        if(kt==0){
            this.sachs[++sodausach] = sach;
            this.soluongtheodausach[sodausach]=soluongmuon;
        }

        this.tongsoluong+=soluongmuon;

    }
    public int getIdBanDoc(){
        return bandoc.getId();
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for(int i=1; i<=sodausach;i++){
            tmp.append(sachs[i].getName()).append("_").append(soluongtheodausach[i]).append("cuon").append("\n");
        }
       return  "Ban doc "+this.bandoc.getName()+"\n"+ tmp;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public int getTongsoluong() {
        return tongsoluong;
    }
}
