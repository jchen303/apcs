public class oilerOne
{
    public static void main(String[] args)
    {
        int oliveOil = 3;
        int virginOliveOil = 0;

        while (oliveOil < 1000)
        {
            if (oliveOil % 3 == 0)
            {
                virginOliveOil = oliveOil + virginOliveOil;
            }
            if (oliveOil % 15 == 0)
            {}
            else
            {
                if (oliveOil % 5 == 0)
                {
                    virginOliveOil = oliveOil + virginOliveOil;
                }
            }
            oliveOil++;
        }
        System.out.println(virginOliveOil);
    }
}