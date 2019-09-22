import java.util.Scanner;

public class WhileGee
{
    public static void main(String[] args)
    {
        Scanner gollyGee = new Scanner(System.in);
        System.out.println("please enter a phrase or series of letters");
        String geeWhiz = gollyGee.nextLine();
        System.out.println("which String would you like to remove?");
        String goshDarn = gollyGee.nextLine();
        int jeepers = goshDarn.length();
        int dangNabIt = 0;

        while (dangNabIt < geeWhiz.length())
        {
            if (geeWhiz.substring(dangNabIt, dangNabIt + 1).equals(goshDarn.substring(0, 1)))
            {
                if (geeWhiz.substring(dangNabIt, jeepers + dangNabIt).equals(goshDarn))
                {
                    if (dangNabIt > 1)
                    {
                        System.out.println(geeWhiz.substring(0, dangNabIt - 1));
                    }
                    System.out.println(geeWhiz.substring(jeepers + dangNabIt, geeWhiz.length()));
                }
                geeWhiz = geeWhiz.substring(jeepers + dangNabIt, geeWhiz.length());
                dangNabIt = -1;
            }
            dangNabIt++;
        }
    }
}
// xR-MxR-MHelloxR-M
// sxsssxssxsxssexssxsesss
// fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn