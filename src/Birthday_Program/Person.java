package Birthday_Program;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
public class Person {
    /**
     * Program that determines the probability that two people share
     * the same birthday in the class
     *
     * @param numberOfDaysInAYear input for the days to be calculated
     * @return the factorial of the large integer input
     * @author Brian Otieno Odhiambo
     */
    public BigInteger testDays(int numberOfDaysInAYear){
        BigInteger birthDay = new BigInteger("1");

        for(int i= 2; i <= numberOfDaysInAYear; i++){
            birthDay = birthDay.multiply(BigInteger.valueOf(i));
        }
        return birthDay;
    }
    //method to calculate how many students share the same birthday.
    public BigDecimal sharedBirthday(){
        int classSize = 30; //number of students in the class

        //formula 1 - (365! / (365 - class-size)! x (365 ^ class-size))
        BigInteger toThePowerClassSize = new BigInteger("365");
        //365**30
        BigInteger outCome = toThePowerClassSize.pow(30);
        //365!
        BigInteger numerator = testDays(365);

        //the difference between 365 days and class size factorial(335!)
        BigInteger remainingDays = testDays(335);
        //(335! * (365**30))
        BigInteger denominator = remainingDays.multiply(outCome);

        BigDecimal one = new BigDecimal("1");
        //probability that no one in the class shares the same birthday
        BigDecimal finalAnswer = new BigDecimal(numerator).divide(new BigDecimal(denominator), 3, RoundingMode.HALF_EVEN);

        //probability that two people in the class share the same birthday
        return one.subtract(finalAnswer);
    }
}
