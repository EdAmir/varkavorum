import java.text.DateFormat;

public class Loan {
    private int sumMoney;
    private String loanPurpose;
    Schedule schedule;

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public LoanEnum getLoanEnum() {
        return loanEnum;
    }

    public void setLoanEnum(LoanEnum loanEnum) {
        this.loanEnum = loanEnum;
    }

    LoanEnum loanEnum;

    public Loan(LoanEnum loanEnum, String loanPurpose, Schedule date) {
        this.loanEnum = loanEnum;
        this.loanPurpose = loanPurpose;
        this.schedule = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "sumMoney=" + sumMoney +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", schedule=" + schedule +
                ", loanEnum=" + loanEnum +
                '}';
    }
}
