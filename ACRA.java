import java.util.Random;

public class ACRA {
    private int score;
    String data;

    public int  score (Customer customer){
        Random random = new Random();
        score = random.nextInt(400,850);
        data = customer.getName() + "'s"+" " + "score is " + score;
        System.out.println(data);
        return  score;
    }

    @Override
    public String toString() {
        return "ACRA{" +
                ", data='" + data + '\'' +
                '}';
    }
}
