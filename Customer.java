import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {

    private List<Loan> loansList;
    private Passport passport;
    private String name;
    private String surname;
    private String birthDate;
    private int salary;

    private Customer(Builder builder) {

        this.loansList = builder.loansList;
        this.passport = builder.passport;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthDate = builder.birthDate;
        this.salary = builder.salary;
    }

    public List<Loan> getLoansList() {
        return loansList;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public static class Builder {
        private List<Loan> loansList;
        private Passport passport;
        private String name;
        private String surname;
        private String birthDate;
        private int salary;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        public Builder() {

        }

        public Builder setLoanList () {
            this.loansList = new ArrayList<>();
            return this;
        }
        public Builder setPassport() {
            this.passport = new Passport.Builder()
                    .build();
            return this;
        }

        public Builder setName() {
            this.name = passport.getName();
            return this;
        }

        public Builder setSurname() {
            this.surname = passport.getSurname();
            return this;
        }

        public Builder setBirthDate() {
            System.out.println("Customer:enter the birth date");
            this.birthDate = sc.next();
            return this;
        }

        public Builder setSalary() {
            this.salary = rd.nextInt(65000, 5000000);
            System.out.println("Customer:the client's salary is " + salary);
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
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
