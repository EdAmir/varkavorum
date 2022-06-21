public class LoanApplication {
    Customer customer;
    private int score;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public LoanEnum getLoan() {
        return loan;
    }
    public void setLoan(LoanEnum loan) {
        this.loan = loan;
    }
    public int getSumOfLoan() {
        return sumOfLoan;
    }
    public void setSumOfLoan(int sumOfLoan) {
        this.sumOfLoan = sumOfLoan;
    }
    LoanEnum loan;
    private int sumOfLoan;
    public LoanApplication(Customer customer, int score, LoanEnum loan, int sumOfLoan) {
        this.customer = customer;
        this.score = score;
        this.loan = loan;
        this.sumOfLoan = sumOfLoan;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "customer=" + customer +
                ", score=" + score +
                ", loan=" + loan +
                ", sumOfLoan=" + sumOfLoan +
                '}';
    }
}
