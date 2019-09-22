import java.util.Scanner;

public class FourH
{
    public static void main(String[] args)
    {
        Scanner hailHydra = new Scanner(System.in);
        System.out.println("please input an integer");
        int hyperlink = hailHydra.nextInt();
        Long helloWorld = 1L;

        for (int hexadecimal = 1; hexadecimal <= hyperlink; hexadecimal++)
        {
            helloWorld = hexadecimal * helloWorld;
        }
        System.out.println("factorial of " + hyperlink + " is " + helloWorld);
    }
}