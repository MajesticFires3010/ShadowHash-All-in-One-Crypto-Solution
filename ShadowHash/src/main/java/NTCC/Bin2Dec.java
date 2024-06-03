package NTCC;

public class Bin2Dec
{
    public static int binaryToDecimal(int[] arr)
    {
        int k = 7;
        int m = 0;
        for(int i: arr)
        {
            m += (int) i*Math.pow(2, k);
            //System.out.println(i + " " + (k));
            k--;
        }

        return m;
    }
}
