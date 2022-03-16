import java.util.Scanner;
public class ShopOnline {
    public static void main(String[] args) {
        Double price, discount, netplay;
        Scanner Barcode = new Scanner(System.in);
        System.out.print("Enter price Total : ");
        price = Barcode.nextDouble();
        discount=0.0;

        if (price > 10000) {
            discount = price * 0.2;
            System.out.println("Discount 20% : "+discount+" THB");
        } else if (price >= 5000){
            discount = price * 0.15;
            System.out.println("Discount 15% : "+discount+" THB");
        } else if (price >= 1000){
            discount = price * 0.1;
            System.out.println("Discount 10% : "+discount+" THB");
        } else if (price >= 500){
            discount = price * 0.05;
            System.out.println("Discount 5% : "+discount+" THB");
        } else {
            System.out.println("Discount 0% : "+"0"+" THB");
        }
        netplay = price-discount;
        System.out.println("Paid : "+netplay+" THB");
    }
}