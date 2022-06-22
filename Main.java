import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Bank bank = new Bank();
        bank.processes();
        ACRA acraScore = new ACRA();
        LoanApplication loanApplication = new LoanApplication(acraScore.score(bank.client), bank.loanType, bank.amount);
        Manager manager = new Manager();
        manager.setDesicionLlistener(bank);
        manager.committee(loanApplication);

        if (manager.isStatus()) {
            System.out.println("Your loan is approved");
        } else {
            System.out.println("Your loan is rejected");
        }
        /**
         *
         * BANK
         * * Customer []
         * անձնագիր
         * Վարկի տեսակ
         * Գումարի չափ ֊ ժամկետ (մին/մաքս բանկի կողմից սահմանված)
         *                        (մենք կարող ենք փոփոխել թույլատրելի սահմաններում)
         *
         * ACRA հարցում
         *
         * approve/reject - BOSS
         *
         *
         *
         * ACRA ֊ կարգավիճակ
         * blocked - true/false
         * 400-500 - աշխատավարձ x2
         * 501-700 - աշխատավարձ x5
         * 701-850 - աշխատավարձ x10
         * score
         *
         * Customer
         * Passport
         * աշխատավարձ ( generate random 65000 ֊ 10000000 )
         * array[]ՎԱՐԿ
         *
         *
         * ՎԱՐԿ
         * գումար
         * տոկոս
         * ժամկետ
         * գրաֆիկ
         * տեսակ
         * վճարման օր (եթե աշխատանքային չէ, հաջորդ աշխատանքայինը)
         * կառուցել գրաֆիկ. բանաձևը վերցնել ինչ որ բանկից․ use Calendar
         *
         *
         *
         * Passport
         * id,
         * անուն, ազգ, հայր
         * ծն. թիվ
         *
         */
    }
}
