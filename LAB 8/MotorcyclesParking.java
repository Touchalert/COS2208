import java.util.*;
import java.lang.Math;

public class MotorcycleParking {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double duration, time, timeIn, timeOut, pay, parkFree;

        parkFree = 10;
        System.out.print("Enter time in: ");
        timeIn = input.nextDouble();
        System.out.print("Enter time out: ");
        timeOut = input.nextDouble();
        time = timeOut - timeIn;
        duration = (time * 100) % 60;

        if (duration <= 10) {
            pay = 0;
        } else {
            if (duration <= 60) {
                pay = (duration - 10) * 1;
            } else {
                if (duration <= 120) {
                    pay = 50 + (duration - 60) * 1.5;
                } else {
                    if (duration <= 180) {
                        pay = 140 + (duration - 120) * 2;
                    } else {
                        pay = 260 + (duration - 180) * 2.5;
                    }
                }
            }
        }
        System.out.println("FROM: " + String.format("%.2f", timeIn));
        System.out.println("TO: " + String.format("%.2f", timeOut));
        System.out.println("DURATION: " + String.format("%.0f", duration) + " minutes");
        System.out.println("PAID: " + String.format("%.2f", pay - parkFree) + " THB");
    }
}