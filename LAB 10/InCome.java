import java.util.Scanner;
public class InCome {
    public static void main(String[] args) {
        Double salary, insurance, spincome, csupport, netincome, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Saraly : ");
        salary = input.nextDouble();
        salary *= 12;
        System.out.print("Enter extraincome : ");
        spincome = input.nextDouble();
        System.out.print("Enter insurance (not over 100,000) : ");
        insurance = input.nextDouble();
        System.out.print("Enter child support : ");
        csupport = input.nextDouble();
        csupport = csupport * 17000;
        netincome = salary + spincome - 60000 - insurance - csupport;
        tax = 0.0;
        if (netincome <= 100000) {
            System.out.println("Tax 0% : "+netincome*0+" THB");
        } else if (netincome <= 300000) {
            tax = (0) + ((netincome -= 100000)* 0.05);
            System.out.println("Tax 5% : "+netincome+" THB");
        } else if (netincome <= 500000) {
            tax = (0) + ((200000)*0.05)+((netincome -= 300000)* 0.1);
            System.out.println("Tax 10% : "+netincome+" THB");
        } else if (netincome <= 300000) {
            tax = (0) + ((200000)*0.05)+(200000*0.1)+((netincome -= 500000)* 0.15);
            System.out.println("Tax 15% : "+netincome+" THB");
        } else if (netincome <= 300000) {
            tax = (0) + ((200000)*0.05)+(200000*0.1)+(250000*0.15)+((netincome -= 750000)* 0.2);
            System.out.println("Tax 20% : "+netincome+" THB");
        }
        System.out.println("Netincome = "+netincome+" THB | Tax = "+tax+" ");
        
    }
}