package HOMEWORK;

public class TimeReminder {
    public static void main(String[] args) {


        String[] message = new String[24];
        message[16] = "Время пить чай";
        int hour = 16;

        System.out.println(hour + " : " + message[hour]);

        String[] message1 = new String[22];
        for (int hour2 = 0; hour2 < message1.length; hour2++) {
            int hourBefore22 = 22 - hour2;
            message1[hour2] = "Осталось часов до 22 = " + hourBefore22;
        }

        int hour1 = 16;
        System.out.println(message1[hour1]);
    }
}
