public class NameThatArithmeticAssignment
{
    public static void main(String[] args)
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
        int alda = s1.length()-3;
        int wayne = s2.length()-3;
        int peck = s3.length()-3;
        String allan = s1.substring(2,alda);
        String john = s2.substring(2,wayne);
        String gregory = s3.substring(2,peck);
        int theDog = 79;
        int jumped = 3;
        int overThe = 7;
        int moon = 2246;
        System.out.println("Allan Alda>>>" + allan);
        System.out.println("John Wayne>>>" + john);
        System.out.println("Gregory Peck>>>" + gregory);
        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19" + " = " + (theDog+jumped*(++jumped+(theDog+3)-(theDog-11))-overThe+(overThe+12)));
        System.out.println("(179 + 21 + 10) / 7 + 181" + " = " + (((theDog+100)+(overThe*3)+(overThe+3))/overThe+(theDog+102)));
        System.out.println("10389 + 56 + 11 + 2246" + " = " + (((jumped-1)*3463)*(overThe*8)*(overThe+4)+moon));
    }    
}