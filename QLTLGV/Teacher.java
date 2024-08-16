package QLTLGV;

public class Teacher {
    private static int cnt = 100;
    private int id;
    private String name;
    private String add;
    private String phonenumber;
    private String degree;

    public Teacher( String name, String add, String phonenumber) {
        this.id = cnt++;
        this.name = name;
        this.add = add;
        this.phonenumber = phonenumber;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
