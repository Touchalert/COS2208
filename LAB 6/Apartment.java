import java.util.Scanner;

public class Apartment {

    public static void main(String[] args) {
        Double room, electric , water , wifi, totalroom;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter room rent : ");
        room = input.nextDouble();
        System.out.print("Enter wifi : ");
        wifi = input.nextDouble();
        System.out.print("Enter electric unit : ");
        electric = input.nextDouble();
        System.out.print("Enter water unit : ");
        water = input.nextDouble();
        
        if(electric <= 2) {
            electric = electric * 10;
            System.out.println("Electric : "+String.format("%.2f",electric)+" THB");
        }else if (electric <= 6){
            electric = (2 * 10) + ((electric -= 2) * 15);
            System.out.println("Electric : " +String.format("%.2f",electric)+" THB");
        } else {
            electric = (2 * 10) + (4 * 15) + ((electric -= 6) * 20);
            System.out.println("Electric : " +String.format("%.2f",electric)+" THB");
        }

            if(water <= 100) {
            water = water * 20;
            System.out.println("Water : "+ String.format("%.2f",water) +" THB");
        } else if (water <= 300) {
            water = (100 * 20) + ((water -= 100) * 30);
            System.out.println("water : "+ String.format("%.2f",water) +" THB");
        } else {
            water = (100 * 10) + (200 * 30) + ((water -= 300)*40);
            System.out.println("Water : "+ String.format("%.2f",water) +" THB");
        }

            totalroom = room+wifi+water+electric;
            System.out.println("Total roomrent : "+ String.format("%.2f",totalroom) +" THB");
    }
}
