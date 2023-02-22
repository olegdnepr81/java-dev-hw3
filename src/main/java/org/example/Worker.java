package org.example;

public class Worker {
    private String name;
    private String birthday;
    private String level;
    private double salary;

    public Worker() {
    }

    public Worker(String name, String birthday, String level, double salary) {
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
}
