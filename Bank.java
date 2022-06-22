import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements DesicionLlistener {
    Scanner sc = new Scanner(System.in);
    double amount ;
    LoanEnum loanType = null;
    String loanPurpose;
    Customer client = new Customer();

    List <Customer> customer = new ArrayList<>();

    @Override
    public void diss() throws IOException {
        System.out.println("DISSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Schedule schedule = new Schedule(amount,loanType.percent, loanType.duration);

        Loan loan1 = new Loan(LoanEnum.APARIK, loanPurpose, schedule);


        System.out.println("Dear"+client.getName()+ "Your loan sum is "+ loan1.getSumMoney());
        System.out.println(loan1);
        loan1.setSumMoney(amount);
        client.loansList.add(loan1);
        customer.add(client);
        System.out.println("Banki hachaxordneri mej avelacvel e ");
        for (Customer cu :customer
                ) {if( cu != null)
            System.out.println(cu);
        }


        FileReader reader = new FileReader("C:\\Users\\eduard.amirjanyan\\Desktop\\Customers.xlsx");

        FileWriter writer = new FileWriter("C:\\Users\\eduard.amirjanyan\\Desktop\\customers.txt");
        writer.write(loan1.toString());
        writer.close();

        String text = reader.toString();
        System.out.println(text);
    }

    public void processes() throws IOException {
        System.out.println("ENTER SUM OF LOAN");
        amount = sc.nextInt();
        System.out.println("what type of loan do you wont? ");
        int loanTypeID = sc.nextInt();

        switch (loanTypeID) {
            case 1:
                loanType = LoanEnum.APARIK;
                break;
            case 2:
                loanType = LoanEnum.BUSSINESS;
                break;
            case 3:
                loanType = LoanEnum.SPAROXAKAN;
                break;
        }
        System.out.println("Enter purpose of Loan ");
        loanPurpose = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Bank{" +

                ", amount=" + amount +
                ", loanType=" + loanType +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", client=" + client +
                ", customer=" + customer +
                '}';
    }
}
