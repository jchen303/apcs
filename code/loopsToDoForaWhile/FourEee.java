import java.util.Scanner;

public class FourEee
{
    public static void main(String[] args)
    {
        Scanner eek = new Scanner(System.in);
        System.out.println("please input one number below ten ");
        int leek = eek.nextInt();
        System.out.println("anotha one");
        int week = eek.nextInt();
        System.out.println("multiplication table for " + leek);
        for (int chic = 1; chic <= leek; chic++)
        {
            if (chic * week < 10)
            {
                System.out.println(chic + "     " + chic * week);
            }
            else
                System.out.println(chic + "    " + chic * week);
        }    
    }
}