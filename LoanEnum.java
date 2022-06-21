import java.text.DateFormat;

public enum LoanEnum {
    APARIK(10,24,0.0),
    BUSSINESS(15,78,2.2),
    SPAROXAKAN(24,36,1.8);

    final float percent;
    final int duration;
    final double otherFees;
    LoanEnum(float percent, int duration, double otherFees){
       this.percent=percent;
       this.duration=duration;
       this.otherFees=otherFees;
    }
}
