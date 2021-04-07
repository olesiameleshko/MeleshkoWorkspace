public class Task6 {
    public static void main (String[] args) {
        final byte SECONDS_PER_MINUTE = 60;
        final byte MINUTES_PER_HOUR = 60;
        final byte HOURS_PER_DAY = 24;
        final int DAYS_PER_YEAR = 365;
        /*
         SECONDS_PER_MINUTE = 59;
         MINUTES_PER_HOUR = 40;
         HOURS_PER_DAY = 20;
         DAYS_PER_YEAR = 366;
        */
        System.out.println("Seconds per minute: " + SECONDS_PER_MINUTE);
        System.out.println("Minutes per hour: " + MINUTES_PER_HOUR);
        System.out.println("Hours per day: " + HOURS_PER_DAY);
        System.out.println("Days per year: " + DAYS_PER_YEAR);
    }
}
//java: cannot assign a value to final variable SECONDS_PER_MINUTE etc