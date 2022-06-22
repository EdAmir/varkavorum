import java.util.Scanner;

public class Passport {
    Scanner sc = new Scanner(System.in);
    private String number;
    private String name;
    private String surname;
    private String date;
//    private DateFormat start;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
//    private DateFormat end;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Passport() {
        System.out.println("Passport:enter the name");
        name = sc.next();
        System.out.println("Passport:enter the surname");
        surname = sc.next();
        System.out.println("Passport:enter the date");
        date = sc.next();
        System.out.println("Passport:enter the passport ID");
        number = sc.next();
//        this.number = number;
//        this.name = name;
//        this.surname = surname;
//        this.date = date;
//        this.start = start;
//        this.end = end;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
