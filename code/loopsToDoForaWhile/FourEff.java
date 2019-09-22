import java.util.Scanner;

public class FourEff
{
    public static void main(String[] args)
    {
        Scanner hefty = new Scanner(System.in);
        System.out.println("please enter a word");
        String hoefty = hefty.nextLine();
        int cleft = hoefty.length();

        System.out.println(hoefty.substring(0, 1));
        System.out.println(hoefty.substring(cleft - 1, cleft));

        for (int left = cleft; left > 0; left--)
        {
            System.out.print(hoefty.substring(left - 1, left));
        }
        System.out.println("\n" + hoefty);
    }
}