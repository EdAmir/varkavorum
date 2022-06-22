import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements DesicionLlistener {
    Scanner sc = new Scanner(System.in);
    int amount ;
    String loanPurpose;

    Schedule shedule = new Schedule("15/11/25");

    String purpose = sc.next();
    Loan loan1 = new Loan(LoanEnum.APARIK, purpose, shedule);
    List <Customer> customer = new ArrayList<>();

    @Override
    public void diss() {
        Customer customer1 = new Customer();
        System.out.println("Your loan is");
        loan1.setSumMoney(amount);
        customer1.loansList.add(loan1);
        customer.add(customer1);
        System.out.println(customer);
    }

    public void processes() {
        System.out.println("ENTER SUM OF LOAN");
        amount = sc.nextInt();
        System.out.println("what type of loan do you wont? ");
        int loanTypeID = sc.nextInt();
        LoanEnum loanType = null;
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


        ACRA acraScore = new ACRA();
        Bank bank = new Bank();
        LoanApplication loanApplication = new LoanApplication( acraScore.score(), loanType, amount);
        Manager manager = new Manager();
        manager.setDesicionLlistener(bank);
        manager.committee(loanApplication);
        if(manager.committee(loanApplication)){
            System.out.println("Your loan is approved");  //diss();
        } else {
            System.out.println("Your loan is rejected");
        }
    }


}
