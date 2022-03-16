import java.util.Scanner;
public class StdGrade {
    public static void main(String[] args){
        double exam , report, homework, finalscr, totalscr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Homework score : ");
        homework = input.nextDouble();
        System.out.print("Enter Report score : ");
        report = input.nextDouble();
        System.out.print("Enter Exam score : ");
        exam = input.nextDouble();
        System.out.print("Enter Final Exam Score : ");
        finalscr = input.nextDouble();
        totalscr = exam+homework+report+finalscr;
        System.out.print("Total Score : "+totalscr+" ");
        if ((totalscr<0)||(totalscr>100)) 
            {System.out.println(" Invalid Score");}
        else if (totalscr>89)
            {System.out.println("Grade A");}
        else if (totalscr>79)
            {System.out.println("Grade B");}
        else if (totalscr>69)
            {System.out.println("Grade C");}
        else if (totalscr>49)
            {System.out.println("Grade D");}
        else 
            {System.out.println("Grade F");}
    }
}