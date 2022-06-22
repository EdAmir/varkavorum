import java.util.Scanner;

public class Passport {
    Scanner sc = new Scanner(System.in);
    private String PassportSeries;
    private String name;
    private String surname;
    private String expiryDate;

    public String getPassportSeries() {
        return PassportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        PassportSeries = passportSeries;
    }

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

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Passport() {
        System.out.println("Passport:enter the name");
        name = sc.next();
        System.out.println("Passport:enter the surname");
        surname = sc.next();
        System.out.println("Passport:enter the Expiry date");
        expiryDate = sc.next();
        System.out.println("Passport:enter the passport ID");
        PassportSeries = sc.next();
    }

    @Override
    public String toString() {
        return "Passport{" +
                "PassportSeries='" + PassportSeries + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
