
public class ArraySum{
    public static void main(String []args)
    {
        int [] numbers={2,6,7,9,4};

        int sum=0;

        for(int number: numbers)
        {
            sum +=number;
        }
        System.out.println("Sum of Array" +sum);
    }
}

