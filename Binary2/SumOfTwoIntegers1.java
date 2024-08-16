package Binary2;

public class SumOfTwoIntegers1 {

    // Time Complexity : O(1)
    // Space Complexity : O(1)
    public static int getSum(int a, int b)
    {
        while(b != 0)
        {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }

        return a;
    }


    public static void main(String[] args) {

        System.out.println(getSum(8,9));


    }


}


