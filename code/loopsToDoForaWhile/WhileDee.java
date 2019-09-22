import java.util.Scanner;

public class WhileDee
{
    public static void main(String[] args)
    {
        Scanner deer = new Scanner(System.in);
        System.out.println("please enter an integer");
        int bambi = deer.nextInt();
        int doe = bambi;
        int jane = 0;

        while (bambi > 0)
        {
            jane = jane + bambi % 10;
            bambi = bambi / 10;
        }
        System.out.println(jane + " is the sum of the digits of " + doe);
    }
} 