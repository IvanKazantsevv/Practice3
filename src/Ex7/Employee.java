package Ex7;

public class Employee {
    String fullname;
    int salary;

    Employee (String fullname, int salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}
