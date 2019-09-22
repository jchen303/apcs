public class mixedResults
{
    public static void main(String[] args)
    {
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;
        double Problem1 = (57.2*(i1/i2)+1);
        double Problem2 = (57.2*((double)i1/i2)+1);
        double Problem3 = (15-i1*(d1*3)+4);
        int Problem4 = (15-i1*(int)(d1*3)+4);
        int Problem5 = (15-i1*((int)d1*3)+4);
        String Prob = "Problem ";
        System.out.println(Prob + "1: " + Problem1);
        System.out.println(Prob + "2: " + Problem2);
        System.out.println(Prob + "3: " + Problem3);
        System.out.println(Prob + "4: " + Problem4);
        System.out.println(Prob + "5: " + Problem5);
    }
}