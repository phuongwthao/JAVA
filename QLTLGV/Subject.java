package QLTLGV;

public class Subject {
    private static int cnt = 100;
    private int id;
    private String name;
    private int periods;
    private int theory;
    private int funding;
    private int salary;

    public Subject(String name, int periods, int theory, int funding) {
        this.id = cnt++;
        this.name = name;
        this.periods = periods;
        this.theory = theory;
        this.funding = funding;
        this.salary = this.theory*this.funding + (this.periods-this.theory)*this.funding*70/100;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPeriods() {
        return periods;
    }

    public int getTheory() {
        return theory;
    }

    public int getFunding() {
        return funding;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", periods=" + periods +
                ", theory=" + theory +
                ", funding=" + funding +
                '}';
    }
}
