public class oilerSeis
{
    public static void main(String[] args)
    {
        double gasoline;
        double petroleum;
        double diesel = 0;
        double kerosene = 0;
        double crudeOil = 1;

        while (crudeOil < 101)
        {
            petroleum = Math.pow(crudeOil, 2);
            crudeOil++;
            kerosene = kerosene + petroleum;
        }
        crudeOil = 1;
        
        while (crudeOil < 101)
        {
            diesel = diesel + crudeOil;
            crudeOil++;
        }
        gasoline = Math.pow(diesel, 2);
        System.out.println((int) (gasoline - kerosene));
    }
}