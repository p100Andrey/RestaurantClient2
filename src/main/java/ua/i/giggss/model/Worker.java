package ua.i.giggss.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @Column(name = "workerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workerId;

    @Column (name = "lastname")
    private String lastName;

    @Column (name = "name")
    private String name;

    @Column (name = "birthday")
    private Date birthday;

    @Column (name = "telephone")
    private String telephone;

    @Column (name = "position")
    private String position;

    @Column (name = "salary")
    private double salary;

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
                "workerId=" + workerId +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", telephone=" + telephone +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
