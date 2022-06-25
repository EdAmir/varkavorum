import java.io.IOException;
import java.util.Random;

public class Manager {
    private boolean decision;
    private boolean status;

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public boolean isStatus() {
        return status;
    }

    DesicionLlistener desicionLlistener;

    public void setDesicionLlistener(DesicionLlistener desicionLlistener) {
        this.desicionLlistener = desicionLlistener;
    }

    public boolean committee(LoanApplication loanApplication) throws IOException {
        Random random = new Random();
        if (loanApplication.getScore() < 550) {

            decision = random.nextBoolean();
        } else {
            decision = random.nextBoolean();
            System.out.println(decision);
        }
        if (desicionLlistener != null) {
            desicionLlistener.logic();
        }
        return status = decision;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "decision=" + decision +
                ", desicionLlistener=" + desicionLlistener +
                '}';
    }
}
