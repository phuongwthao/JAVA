package QuanLyMuonSachThuVien;

import java.util.Objects;
import java.util.Scanner;

public class ThuVien {
    private Sach[] saches;
    private BanDoc[] banDocs;
    private QLMuonSach[] qlMuonSaches;
    private int soLuongSach;
    private int soLuongBanDoc;
    private int soLuongQLMuonSach;

    public ThuVien() {
        this.saches = new Sach[10000];
        this.banDocs = new BanDoc[10000];
        this.qlMuonSaches = new QLMuonSach[10000];
        this.soLuongSach = 0;
        this.soLuongBanDoc = 0;
        this.soLuongQLMuonSach= 0;
    }
    public boolean checkMajor(String major){
        if(Objects.equals(major, "Khoa hoc tu nhien")){
            return true;
        }
        if(Objects.equals(major, "Van hoc-Nghe thuat")){
            return true;
        }
        if(Objects.equals(major, "Dien tu Vien thong")){
            return true;
        }
        return Objects.equals(major, "Cong nghe thong tin");
    }

    public boolean checkType(String type){
        if(Objects.equals(type, "sinh vien")){
            return true;
        }
        if(Objects.equals(type, "hoc vien cao hoc")){
            return true;
        }
        return Objects.equals(type, "giao vien");
    }
    public void nhapdausachmoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong sach can nhap:");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            System.out.println("Nhap ten sach");
            String name = sc.nextLine();
            System.out.println("Nhap ten tac gia");
            String author = sc.nextLine();
            System.out.println("Nhap ten chuyen nganh");
            String major =sc.nextLine();
            while (!checkMajor(major)){
                System.out.println("Nhap lai ten chuyen nganh");
                major = sc.nextLine();
            }
            System.out.println("Nhap nam xuat ban");
            int year = Integer.parseInt(sc.nextLine());
            Sach sach = new Sach(name,author,major,year);
            this.saches[++this.soLuongSach] = sach;
        }
    }
    public void hienthidausach(){
        System.out.println("Danh sach cac dau sach da co");
        for(int i=1; i<=this.soLuongSach; i++){
            System.out.println(saches[i]);
        }
    }
    public void nhapbandocmoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong ban doc can nhap");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n;i++){
            System.out.println("Nhap ten ban doc");
            String name = sc.nextLine();
            System.out.println("Nhap dia chi ban doc");
            String add = sc.nextLine();
            System.out.println("Nhap SDT ban doc");
            String phonenumber = sc.nextLine();
            System.out.println("Nhap loai ban doc");
            String type = sc.nextLine();
            while (!checkType(type)){
                System.out.println("Nhap lai loai ban doc");
                type = sc.nextLine();
            }
            BanDoc bandoc = new BanDoc(name,add,phonenumber,type);
            this.banDocs[++soLuongBanDoc] = bandoc;
        }
    }
    public void hienthibandoc(){
        System.out.println("Danh sach ban doc da co");
        for(int i=1; i<=this.soLuongBanDoc;i++){
            System.out.println(banDocs[i]);
        }
    }

    public void muonsach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ban doc");
        int id = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=this.soLuongBanDoc;i++){
            System.out.println(banDocs[i]);
            if(banDocs[i].getId()==id){
                QLMuonSach qlMuonSach = new QLMuonSach(banDocs[i]);
                System.out.println("Nhap so dau sach ban doc muon");
                int n = Integer.parseInt(sc.nextLine());

                for(int j=1; j<=n; j++){
                    System.out.println("Nhap id sach");
                    int k = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap so luong muon");
                    int z = Integer.parseInt(sc.nextLine());
                    for(int x=1; x<=this.soLuongSach;x++){
                        if(k == saches[x].getId()){
                            qlMuonSach.muonsach(saches[x],z);
                            break;
                        }
                    }
                }

                this.qlMuonSaches[++this.soLuongQLMuonSach] = qlMuonSach;
                return;
            }
        }
        System.out.println("Khong ton tai ban doc co id "+ String.valueOf(id));

    }
    public void hienthiDS(){
        for(int i =1; i<=this.soLuongQLMuonSach;i++){
            System.out.println(qlMuonSaches[i]);
        }
    }
    public void sortByNameBanDoc(){
        for(int i=1; i<=this.soLuongQLMuonSach-1;i++){
            for(int j=i+1; j<=this.soLuongQLMuonSach;i++){
                if(this.qlMuonSaches[i].getBandoc().getName().compareTo(this.qlMuonSaches[j].getBandoc().getName())>0){
                    QLMuonSach tmp = qlMuonSaches[i];
                    qlMuonSaches[i]=qlMuonSaches[j];
                    qlMuonSaches[j]=tmp;

                }
            }
        }
        hienthiDS();
    }

    public void sortBySoLuongSachDuocMuon(){
        for(int i=1; i<=this.soLuongQLMuonSach-1; i++){
            for(int j = i+1; j<this.soLuongQLMuonSach;j++){
                if(this.qlMuonSaches[i].getTongsoluong()>this.qlMuonSaches[i].getTongsoluong()){
                    QLMuonSach tmp = qlMuonSaches[i];
                    qlMuonSaches[i]=qlMuonSaches[j];
                    qlMuonSaches[j]=tmp;
                }
            }
        }
        hienthiDS();
    }

    public void searchByNameBanDoc(String n){
        for(int i=1; i<=this.soLuongQLMuonSach; i++){
            if(Objects.equals(this.qlMuonSaches[i].getBandoc().getName(), n)){
                System.out.println(qlMuonSaches[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien thuVien = new ThuVien();
        while (true){
            System.out.println("----------------");
            System.out.println("1. Nhap danh sach dau sach moi. In ra ds cac dau sach da co");
            System.out.println("2. Nhap danh sach ban doc moi. In ra ds ban doc da co");
            System.out.println("3. Lap bang QL muon sach va in danh sach ra man hinh");
            System.out.println("4. Sap xep danh sach QL muon sach");
            System.out.println("5. Tim kiem va hien thi danh sach muon sach theo ten ban doc");
            System.out.println("----------------");
            System.out.println("Nhap lua chon");

            int option = sc.nextInt();
            switch (option){
                case 1:
                    thuVien.nhapdausachmoi();
                    thuVien.hienthidausach();
                    break;
                case 2:
                    thuVien.nhapbandocmoi();
                    thuVien.hienthibandoc();
                    break;
                case 3:
                    thuVien.hienthibandoc();
                    thuVien.muonsach();
                    thuVien.hienthiDS();
                    break;
                case 4:
                    System.out.println("Nhap lua chon");
                    System.out.println("a. Theo ten ban doc");
                    System.out.println("b. Theo so luong cuon sach duoc muon (giam dan)");
                    String x = sc.next();
                    sc.nextLine();
                    if(Objects.equals(x, "a")){
                        thuVien.sortByNameBanDoc();
                    }
                    else {
                        thuVien.sortBySoLuongSachDuocMuon();
                    }
                    break;
                case 5:
                    System.out.println("Nhap ten ban doc");
                    String n = sc.next();
                    sc.nextLine();
                    thuVien.searchByNameBanDoc(n);
            }


        }
    }
}
