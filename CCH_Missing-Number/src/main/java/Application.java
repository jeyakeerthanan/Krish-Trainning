import java.util.Scanner;

public class Application {

    public static void main (String [] args){


        int size;


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total count of numbers in the sequence : ");
        size=sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the sequence: ");

        //validate integers

        for(int i=0; i<size; i++)
        {
           try{
               array[i]=sc.nextInt();
           }
           catch (Exception e){
               System.out.println(e+ " Input should be a number!!!!!");
                    System.exit(0);

           }
        }

        MissingNumber.validateSameValue(array);

        System.out.println("Sequence loaded..... ");
        for(int i=0; i<size; i++)
        {
            System.out.println(array[i]);
        }



        MissingNumber obj= new MissingNumber(array);
        int[] sorted_array = obj.sortSequence(array,size);
        obj.missingValue(sorted_array);









    }
}
