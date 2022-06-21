import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SUM OF LOAN");
        int amount = sc.nextInt();
        int scora = rd.nextInt(450, 850);

        Bank bank = new Bank();
        bank.applyForLoan(bank.customer1, amount, "24", "guyqi gnum");
        LoanApplication loanApplication = new LoanApplication(bank.customer1, scora, LoanEnum.APARIK, amount);
        Manager manager = new Manager();
        manager.setDesicionLlistener(bank);
        manager.committee(loanApplication);


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
