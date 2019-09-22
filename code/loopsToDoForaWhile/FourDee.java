import java.util.Scanner;

public class FourDee
{
    public static void main(String[] args)
    {
        Scanner deezNuts = new Scanner(System.in);
        System.out.println("please enter a word");
        String acorns = deezNuts.nextLine();

        for (int pineNut = acorns.length(); pineNut > 0; pineNut--)
        {
                System.out.println(acorns.substring(0, pineNut));
        }
    }
}