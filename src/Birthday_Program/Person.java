package Birthday_Program;

import java.math.BigDecimal;

public class Person {
    public long testDays(int numberOfDaysInAYear){

        if(numberOfDaysInAYear == 0) return 1;
        return numberOfDaysInAYear * testDays(numberOfDaysInAYear - 1);
    }

    public BigDecimal sharedBirthday(){

        int classSize = 30;
        int birthday = 1;
        long possibleOutcomes = (long) Math.pow(365,classSize);

        BigDecimal answer =  (new BigDecimal(testDays(365)).divide(new BigDecimal(testDays(365 - classSize) * possibleOutcomes)));
        return answer;

    }
}
