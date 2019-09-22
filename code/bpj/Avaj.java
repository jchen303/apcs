import java.util.Scanner;

public class Avaj
{
    public static void main(String[] args)
    {
        Scanner rennacs = new Scanner(System.in);
        System.out.println("Please enter your name. ");
        String gnirts = rennacs.nextLine();
        int tni = gnirts.length();
        int esrever;

        for (esrever = (tni - 1); esrever >= 0; esrever--)
              System.out.print(gnirts.substring(esrever, esrever + 1).toLowerCase());
        System.out.print("\n");
    }
}