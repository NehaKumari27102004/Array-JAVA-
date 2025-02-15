public class ArrayMaxMin {

    public static void main(String [] args)
    {
        int [] numbers={2,6,8,33,9};


        int max=numbers[0];

        int min=numbers[0];

        for(int i=0; i<numbers.length; i++ )
        {
            if( numbers [i] > max)
            {
                max=numbers[i];
            }if(numbers [i] <min)
            {
                min=numbers[i];
            }
        }


        System.out.println("MaxNumber"+max);
        System.out.println("MixNumber"+min);
    }
    
}
