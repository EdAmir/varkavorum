import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    Random rd= new Random();
    Loan[] loansList = new Loan[10];

    Passport passport = new Passport();
    private String name=passport.getName();
   private String surname= passport.getSurname();
    private String birthDate;
    private int salary;

//    public Passport getPassport() {
//        return passport;
//    }
//
//    public void setPassport(Passport passport) {
//        this.passport = passport;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public Loan[] getLoansList() {
        return loansList;
    }

    public Customer() {
        Passport passport = this.passport;
        System.out.println("enter the birth date");
        birthDate=sc.next();
        salary=rd.nextInt(65000,5000000);
        System.out.println("the client's salary is " + salary);
        System.out.println("enter purpose OF LOAN");

//        this.passport = passport;
//        this.name = name;
//        this.surname = surname;
//        this.birthDate = birthDate;
//        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loansList=" + Arrays.toString(loansList) +
                ", passport=" + passport +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
