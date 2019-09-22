import java.util.Scanner;

public class massTimesGravityOnOtherPlanets
{
    public static void main(String[] args)
    {
        Scanner mg = new Scanner(System.in);
        Scanner ma = new Scanner(System.in);
        System.out.print("What is your weight on Earth? (please round to the nearest integer) ");
        int mgEqualsNormalForce = mg.nextInt();

        String whatIsNew = "<J>oopiter";
        String ceeOverLambda = "<V>enus";
        String ha = "<M>ercury";
        String hahaaa = "<K>epler-20b";

        System.out.println("\n" + whatIsNew);
        System.out.println(ceeOverLambda);
        System.out.println(ha);
        System.out.println(hahaaa);

        System.out.print("\n   Selection? ");
        String mgEqualsTension = ma.nextLine();
        Double stupidPulleyProblems;
        char effEqualsMA = mgEqualsTension.charAt(0);

        switch(effEqualsMA)
        {
            case 'J':
            case 'j':
                stupidPulleyProblems = mgEqualsNormalForce * 2.528;
                System.out.println("\nYour weight on Joopiter would be " + stupidPulleyProblems);
                break;
            case 'V':
            case 'v':
                stupidPulleyProblems = mgEqualsNormalForce * 0.904;
                System.out.println("\nYour weight on Venus would be " + stupidPulleyProblems);
                break;
            case 'M':
            case 'm':
                stupidPulleyProblems = mgEqualsNormalForce * 0.38;
                System.out.println("\nYour weight on Mercury would be " + stupidPulleyProblems);
                break;
            case 'K':
            case 'k':
                stupidPulleyProblems = mgEqualsNormalForce * 3.0;
                System.out.println("\nYour weight on Kepler-20b would be " + stupidPulleyProblems);
                break;
            default:
                System.out.println("clearly, joo weren't looking at the choices.");
        }
    }
}