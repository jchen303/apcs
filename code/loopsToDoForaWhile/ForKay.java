import java.util.Scanner;

public class ForKay
{
    public static void main(String[] args)
    {
        Scanner everyKissBeginsWithKay = new Scanner(System.in);
        System.out.println("please enter an integer");
        int okay = everyKissBeginsWithKay.nextInt();
        System.out.println("anotha one (but larger)");
        int beret = everyKissBeginsWithKay.nextInt();
        int fourOhOneKay = 0;

        for (int bouquet = 1; bouquet <= okay; bouquet++)
        {
            if (okay % bouquet == 0)
            {
                if (beret % bouquet == 0)
                    fourOhOneKay = bouquet;
            }
        }
        System.out.println("the gcd of " + okay + " and " + beret + " is " + fourOhOneKay);
    }
}