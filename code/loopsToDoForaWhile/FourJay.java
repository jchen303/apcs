import java.util.Scanner;

public class FourJay
{
    public static void main(String[] args)
    {
        Scanner blueJay = new Scanner(System.in);
        System.out.println("please enter a base 2 - binary number");
        Long blueJ = blueJay.nextLong();
        String sparrow = "" + blueJ;
        double raven = sparrow.length() - 1;
        double cardinal = 0;
        double hawk = 2.0;

        for (int woodpecker = 0; woodpecker <= sparrow.length() - 1; woodpecker++)
        {
            if (sparrow.substring(woodpecker, woodpecker + 1).equals("1"))
                cardinal = cardinal + Math.pow(hawk, raven);
            raven--;
        }
        System.out.println(sparrow + " == " + (int)cardinal);
    }
}