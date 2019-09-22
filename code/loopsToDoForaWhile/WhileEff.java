import java.util.Scanner;

public class WhileEff
{
    public static void main(String[] args)
    {
        Scanner jefe = new Scanner(System.in);
        System.out.println("please enter a phrase or series of letters");
        String boss = jefe.nextLine();
        System.out.println("which letter would you like to remove?");
        String chief = jefe.nextLine();
        int bigMan = 0;

        System.out.println(boss + " - letter to remove " + chief);

        while (bigMan < boss.length())
        {
            if (! boss.substring(bigMan, bigMan + 1).equals(chief))
                System.out.print(boss.substring(bigMan, bigMan + 1));
            bigMan++;
        }
        System.out.println("\n");
    }
}