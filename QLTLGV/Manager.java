package QLTLGV;

import java.util.Objects;
import java.util.Scanner;

public class Manager {
    private Subject[] subjects;
    private Teacher[] teachers;
    private Statistic[] statistics;
    private int numberOfSubject;
    private int numberOfTeacher;
    private int numberOfStatistic;

    public Manager() {
        this.subjects = new Subject[1000];
        this.teachers = new Teacher[1000];
        this.statistics = new Statistic[1000];
        this.numberOfStatistic = 0;
        this.numberOfSubject = 0;
        this.numberOfTeacher=0;

    }
    public void addNewSubjects(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mon hoc muon them moi");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            System.out.println("Nhap ten mon hoc");
            String name = sc.nextLine();
            System.out.println("Nhap tong so tiet");
            int periods = Integer.parseInt(sc.nextLine());
            System.out.println("So tiet ly thuyet");
            int theory = Integer.parseInt(sc.nextLine());
            System.out.println("Muc kinh phi");
            int funding = Integer.parseInt(sc.nextLine());
            Subject subject = new Subject(name,periods,theory,funding);
            subjects[numberOfSubject++]=subject;
        }
    }

    public void displayAllSubjects(){
        for(int i=0; i<this.numberOfSubject;i++){
            System.out.println(subjects[i]);
        }
    }

    public void addNewTeachers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giang vien muon them moi");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            System.out.println("Nhap ten giang vien");
            String name = sc.nextLine();
            System.out.println("Nhap dia chi");
            String add = sc.nextLine();
            System.out.println("Nhap SDT");
            String phonenumber = sc.nextLine();
            Teacher teacher = new Teacher(name,add,phonenumber);
            System.out.println("Lua chon trinh do");
            System.out.println("1. GS-TS");
            System.out.println("2. PGS-TS");
            System.out.println("3. Giang vien chinh");
            System.out.println("4. Thac sy");
            int tmp = Integer.parseInt(sc.nextLine());
            if(tmp==1){
                teacher.setDegree("GS-TS");
            }
            else if(tmp==2){
                teacher.setDegree("PGS-TS");
            }
            else if(tmp == 3){
                teacher.setDegree("Giang vien chinh");
            }
            else {
                teacher.setDegree("Thac sy");
            }
            teachers[numberOfTeacher++] = teacher;
        }

    }
    public void displayAllTeachers(){
        for(int i=0; i<this.numberOfTeacher;i++){
            System.out.println(teachers[i]);
        }

    }
    public void displayAllStatistics(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numberOfTeacher; i++){
            statistics[i]= new Statistic(teachers[i]);
            System.out.println("Lap bang ke khai giang day cho GV "+teachers[i].getName());
            System.out.println("So mon hoc ma giang vien day");
            int n = Integer.parseInt(sc.nextLine());
            for(int j=0; j<n; j++){
                System.out.println("Nhap id mon hoc");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap so lop ");
                int classes = Integer.parseInt(sc.nextLine());
                int kt = 0;
                for(Subject subject:subjects){
                    if(subject.getId()==id){
                        kt = 1;
                        statistics[i].report(subject,classes);
                        break;
                    }
                }
                if(kt==0){
                    System.out.println("Khong tim thay mon hoc");
                }
            }
            statistics[i].displayReport();
        }
    }
    public void sortByNameOfTeacher(){
        for(int i=0; i<numberOfTeacher-1; i++){
            for(int j=i+1; j<numberOfTeacher; j++){
                if(teachers[i].getName().compareTo(teachers[j].getName())>0){
                    Teacher tmp = teachers[i];
                    teachers[i]=teachers[j];
                    teachers[j]=tmp;
                }
            }
        }
        for(int i=0; i<numberOfTeacher; i++){
            statistics[i].displayReport();
        }

    }
    public void sortByPeriods(){
       // Chỉ sắp xếp theo tổng số tiết được thôi ạ chứ ko thể xếp theo số tiết giảng dạy mỗi môn của mỗi GV được

    }

    public void displaySalary(){
        for(int i=0; i<this.numberOfSubject;i++){
            System.out.print(teachers[i].getName());
            System.out.println(statistics[i].CaculateSalary());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true){
            System.out.println("-----------------");
            System.out.println("1. Nhap danh sach mon hoc moi. In ra danh sach mon hoc");
            System.out.println("2. Nhap danh sach giang vien moi. In ra danh sach GV");
            System.out.println("3. Lap bang ke khai cho moi giang vien");
            System.out.println("4. Sap xep danh sach ke khai giang day");
            System.out.println("5. Tinh toan va lap bang tinh tien cong cho moi GV");
            System.out.println("-----------------");
            System.out.println("Nhap lua chon");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    manager.addNewSubjects();
                    manager.displayAllSubjects();
                    break;
                case 2:
                    manager.addNewTeachers();
                    manager.displayAllTeachers();
                    break;
                case 3:
                    manager.displayAllStatistics();
                    break;
                case 4:
                    System.out.println("a. Theo ho ten giang vien");
                    System.out.println("b. Theo so tiet giang day moi mon giam dan");
                    System.out.println("Nhap lua chon");
                    String tmp = sc.nextLine();
                    if(Objects.equals(tmp, "a")){
                        manager.sortByNameOfTeacher();
                    }
                    else {
                        manager.sortByPeriods();
                    }
                    break;
                case 5:
                    manager.displaySalary();
                    break;
            }
        }

    }
}
