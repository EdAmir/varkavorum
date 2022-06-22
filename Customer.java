import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    List<Loan> loansList = new ArrayList<>();
    Passport passport = new Passport();
    private String name = passport.getName();
    private String surname = passport.getSurname();
    private String birthDate;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Loan> getLoansList() {
        return loansList;
    }

    public Customer() {
        System.out.println("Customer:enter the birth date");
        birthDate = sc.next();
        salary = rd.nextInt(65000, 5000000);
        System.out.println("Customer:the client's salary is " + salary);
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", loansList=" + loansList +
                ", passport=" + passport +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
