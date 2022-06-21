import java.util.Random;

public class ACRA {
    private String status;
    private int score;

    public int  score (Customer customer){
        Random random = new Random();
        score = random.nextInt(400,850);
        System.out.println("your score is " + score);
        return  score;
    }
}
