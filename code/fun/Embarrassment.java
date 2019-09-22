import java.util.Scanner;

public class Embarrassment
{
    public static void main(String[] args)
    {
        Scanner notSurprised = new Scanner(System.in);
        System.out.print("would you like to know how we did at island bowl? ");
        String fortyTwotoZero = notSurprised.nextLine();
        int sorrow = 0;

        if (!fortyTwotoZero.equalsIgnoreCase("no"))
        {
        while (sorrow <= 420000)
            {
                if (sorrow % 7 == 0)
                {
                    System.out.print("                   encinal stomped on us           ( .  _ .  )      ");
                    if (sorrow % 3 == 0)
                    {
                        System.out.print("42 - 0");
                    }
                }
                try 
                {
                    Thread.sleep(4);
                } catch (InterruptedException e) {}
                sorrow++;
            }
        }
        else
        {
            System.out.println("good choice. you probably didn't want to hear the score anyways.");
        }

    }
}