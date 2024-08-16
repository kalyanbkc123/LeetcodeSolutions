package Binary2;

public class NoOf1Bits {

    public static int count(int n)
    {
        int result =  0;
        while(n != 0 )
        {
            result += n & 1;
            n = n >> 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The number of 1 bits are :: "+count(111));


    }
}
