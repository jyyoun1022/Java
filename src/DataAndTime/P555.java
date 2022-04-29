package DataAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class P555 {
    public Period period;

    @Override
    public String toString() {
        return "P555{" +
                "period=" + period.getYears() +period.getMonths()+period.getDays()+
                '}';
    }

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1996,10,22);
        LocalTime birthTime = LocalTime.of(10, 59, 59);

        System.out.println("today = " + today);
        System.out.println("birthTime = " + birthTime);
        System.out.println("birthDate = " + birthDate);
        System.out.println("now = " + now);

        Period period = Period.between(birthDate, today);
        System.out.println("period = " + period);
        System.out.println(period.getMonths());


    }
}
