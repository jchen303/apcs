import java.util.Scanner;

public class notOddOrnotEvenThrice
{
    public static void main(String[] args)
    {
        Scanner strange = new Scanner(System.in);
        int thrice = 0;
        while (thrice < 3)
        {
        String odd = "Enter an integer: ";
        System.out.print(odd);
        int peculiar = strange.nextInt();
        thrice++;

        if ((peculiar % 2) == 0)
            System.out.println ("The integer " + peculiar + " is even.");
        else
            System.out.println ("The integer " + peculiar + " is odd.");
        }
    }
}