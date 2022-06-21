import java.util.Random;

public class Manager {
    private boolean decision;
    DesicionLlistener desicionLlistener;

    public void setDesicionLlistener(DesicionLlistener desicionLlistener) {
        this.desicionLlistener = desicionLlistener;
    }

    public boolean committee(LoanApplication loanApplication) {
        Random random = new Random();
        if (loanApplication.getScore() < 550) {

            decision = random.nextBoolean();
        }
        else {
            decision = true; //random.nextBoolean();
            System.out.println(decision);
        }
        if (desicionLlistener != null) {
            desicionLlistener.diss();
        }
        return decision;
    }
}
