import java.util.Scanner;

public class menufindarea {
    public static void main(String[] args) {
        int base, high, longs, length, rectangle, radius, menu;
        double triangle, cycle;
        ;
        Scanner random = new Scanner(System.in);
        System.out.println("manu");
        System.out.println("calculate rectangle area ....enter 1");
        System.out.println("calculate triangle area ....enter 2");
        System.out.println("calculate cycle area ....enter 3");
        System.out.println("close program ....enter 0");
        menu = random.nextInt();

        switch (menu) {
            case 1: {
                System.out.print("enter longs : ");
                longs = random.nextInt();
                System.out.print("enter length : ");
                length = random.nextInt();
                rectangle = longs * length;
                System.out.print("Area rectangle  =  " + " " + rectangle + " " + " cm.");
            }
                break;
            case 2: {
                System.out.print("enter base : ");
                base = random.nextInt();
                System.out.print("enter high : ");
                high = random.nextInt();
                triangle = 0.5 * base * high;
                System.out.print("Area triangle =  " + " " + triangle + " " + " cm.");
                break;
            }
            case 3: {
                System.out.print("enter radius : ");
                radius = random.nextInt();
                cycle = (22 / 7) * radius * radius;
                System.out.print("Area cycle =  " + " " + cycle + " " + " cm.");
                break;

            }

            default: {
                System.out.print("INVALID CHOICE");
            }
                break;
        }

    }

}
