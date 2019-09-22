import java.util.Scanner;

public class FourSee
{
    public static void main(String[] args)
    {
        Scanner vision = new Scanner(System.in);
        System.out.println("please enter a word ");
        String sight = vision.nextLine();
        int nearsighted = sight.length();

        for (int farsighted = 0; farsighted < nearsighted; farsighted++)
        {
            System.out.println(sight);
        }

    }
}