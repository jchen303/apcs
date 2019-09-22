import java.util.Scanner;

public class WhileSea
{
    public static void main(String[] args)
    {
        Scanner ocean = new Scanner(System.in);
        System.out.println("please enter an integer");
        int bay = ocean.nextInt();
        String water = "" + bay;
        int hTwoOh = 0;
        String lake = "";

        while (hTwoOh < water.length())
        {
            lake = water.substring(hTwoOh, hTwoOh + 1) + lake;
            hTwoOh++;
        }
        System.out.print(bay + " reversed is " + lake + "\n");
    }
}