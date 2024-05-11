public class Employee {
    private String name;
    private String sname;

    public Employee(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsname() {
        return sname;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }
}
