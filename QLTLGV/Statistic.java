package QLTLGV;

import java.util.Arrays;
import java.util.Scanner;

public class Statistic {
    private Teacher teacher;
    private Subject[] subjects;
    private int[] classrooms;
    private int quantitySubject;
    private int sumOfPeriods;
    private int salary;

    public Statistic(Teacher teacher) {
        this.teacher = teacher;
        this.subjects = new Subject[100];
        this.classrooms = new int[100];
        this.quantitySubject = 0;
        this.sumOfPeriods = 0;
        this.salary=0;

    }

    public void report(Subject subject, int classes){
        if(classes>3 || classes<=0){
            System.out.println("So lop moi mon la so nguyen duong va khong lon hon 3");
            return;
        }
        this.sumOfPeriods+=classes*subject.getPeriods();
        if(sumOfPeriods>200){
            System.out.println("Tong so tiet khong duoc lon hon 200");
            return;
        }
        this.classrooms[quantitySubject]=classes;
        this.subjects[quantitySubject++]= subject;


    }
    public void displayReport(){
        System.out.println(this.teacher.getName());
        for(int i=0; i<this.quantitySubject;i++){
            System.out.println("Mon hoc "+ subjects[i].getName()+" "+classrooms[i]+" " +"lop");
        }
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "teacher=" + teacher +
                ", subjects=" + Arrays.toString(subjects) +
                ", classrooms=" + Arrays.toString(classrooms) +
                '}';
    }
    public int CaculateSalary(){
        for(int i=0; i<this.quantitySubject;i++){
            this.salary+=subjects[i].getSalary()*classrooms[i];
        }
        return this.salary;
    }


}
