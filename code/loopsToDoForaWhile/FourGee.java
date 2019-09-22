import java.util.Scanner;

public class FourGee
{
    public static void main(String[] args)
    {
        Scanner geez = new Scanner(System.in);
        System.out.println("please enter an integer");
        int jeez = geez.nextInt();
        System.out.println("anotha one");
        int cheez = geez.nextInt();
        int threeGee = 0;
        int fourGee = 0;
        int fiveGee = 0;
        int wheeze = jeez;

        for (int geeWhiz = 0; jeez <= cheez;)
        {
            geeWhiz = geeWhiz + jeez;
            jeez++;

            if (jeez > cheez)
                threeGee = geeWhiz;
            if (jeez % 2 != 0)
                fourGee++;
            else
                fiveGee++;
        }
        System.out.println(wheeze + " " + cheez);
        System.out.println("total " + threeGee);
        System.out.println("even count " + fourGee);
        System.out.println("odd count " + fiveGee);
    }
}