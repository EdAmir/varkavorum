import java.util.Scanner;

public class Bank implements DesicionLlistener{
    private int money = 1000000000;
    Scanner sc=new Scanner(System.in);

    Schedule shedule = new Schedule("15/11/25");

    Customer customer1 = new Customer();
    String purpose=sc.next();
    Loan loan1 = new Loan(LoanEnum.APARIK,purpose, shedule);
    Customer[] customer = new Customer[100];

    public void applyForLoan(Customer customer, int sum, String duration, String loanPurpose) {
        ACRA acra = new ACRA();
        LoanApplication loanApplication = new LoanApplication(customer, acra.score(customer), LoanEnum.APARIK,2000000);
        Manager manager1 = new Manager();
        manager1.committee(loanApplication);
    }

    @Override
    public void diss() {
        loanProcess() ;

    }

    public void loanProcess(){
        System.out.println("Your loan is");

        loan1.setSumMoney(200000);



        customer1.loansList[0]=(loan1);
        //System.out.println( customer1.loansList.toString());
        customer[0]=customer1;
        System.out.println( customer[0].toString());
    }
}
