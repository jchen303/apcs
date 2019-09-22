import java.util.Scanner;

public class FourAye
{
    public static void main(String[] args)
    {
        Scanner argh = new Scanner(System.in);
        System.out.println("please enter an integer");
        int matey = argh.nextInt();
        int treasure = 0;

        for (int ship = 2; ship < matey; ship++)
        {
            if (matey % ship == 0)
                treasure++;
        } 
        if (treasure == 0)
            System.out.println(matey + " is prime.");
        else
            System.out.println(matey + " is not prime.");
    }
}