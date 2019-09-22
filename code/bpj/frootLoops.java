public class frootLoops
{
    public static void main(String[] args)
    {
        int jerm = 0;
        while (jerm < 30000)
        {
            if (jerm % 2 == 0)
            System.out.print("                      jeremy is cool                                                          ");
            if (jerm % 3 == 1)
            {
                System.out.print("jeremy is cool                                                                                  ");
                try 
                {
                    Thread.sleep(9);    
                } catch (InterruptedException e) {}
            }
                else 
                {
                    System.out.print("      jeremy is cool                                      ");
                    try 
                    {
                        Thread.sleep(24);
                    } catch (InterruptedException e) {}
                }
        }
    }
}