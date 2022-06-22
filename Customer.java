import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Customer {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    List<Loan> loansList = new ArrayList<>();
    Passport passport = new Passport();
    private String name = passport.getName();
    private String surname = passport.getSurname();
    private String birthDate;
    private int salary;

    public List<Loan> getLoansList() {
        return loansList;
    }

    public Customer() {
        Passport passport = this.passport;
        System.out.println("Customer:enter the birth date");
        birthDate = sc.next();
        salary = rd.nextInt(65000, 5000000);
        System.out.println("Customer:the client's salary is " + salary);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "sc=" + sc +
                ", rd=" + rd +
                ", loansList=" + loansList +
                ", passport=" + passport +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
