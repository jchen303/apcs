public class oilerEr // "2" in mandarin
{
    public static void main(String[] args)
    {
        int extraVirginOliveOil = 0;
        int sunflowerOil = 0;
        int coconutOil;
        int palmOil = 0;

        while (palmOil < 4E6)
        {
            if (palmOil == 0)
            {
                palmOil++;
            }    
            if (palmOil > 0)
            {
                coconutOil = palmOil;
                palmOil = sunflowerOil + palmOil;

                if (palmOil % 2 == 0)
                {
                    extraVirginOliveOil = palmOil + extraVirginOliveOil;
                }    
                sunflowerOil = palmOil;
                palmOil = coconutOil + palmOil;

                if (palmOil % 2 == 0)
                {
                    extraVirginOliveOil = palmOil + extraVirginOliveOil;
                }
            }
        }
        System.out.println(extraVirginOliveOil);
    }
}