
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {


    private int [] number_sequence;

    public MissingNumber( int[] number_sequence) {

        this.number_sequence = number_sequence;
    }

    public void missingValue(int[] array){

       boolean first= true;
       int index = array.length-1;
       int count=0;
        int missing_number = 0;

      for(int k=0; k< index; k++){

          if ( ((array[k+1])- (array[k])) != 1 ){

              //validate to have one missing number
              count++;

              if (count==2){
                  System.out.println(" This program is limited to identify one missing value");
                  System.out.println(" Please re-run the program!!!!");
                  System.exit(0);
              }

               missing_number = array[k] +1;

          }


      }
      if (missing_number != 0) {
          System.out.println("missing number is :" + " " + missing_number);
          first = false;
      }
      if (first) {
          System.out.println("*********************************");
          System.out.println("Either first number or last number missed in the sequence");
          System.out.println("................................");
          System.out.println("If it is a  first number :" + (array[0] - 1));
          System.out.println("or");
          System.out.println("If it is a  last  number :" + (array[index] + 1));
      }


  }

    public  int[] sortSequence(int[] array, int size){
      //sorting

      int index = array.length-1;
      int temp;
      int j;


      for (int i=0; i< index; i++){

          j = i;

          for(int k=0; k< index-j; k++){

              if (array[k] > array[k+1]){

                  //swapping
                  temp= array[k];
                  array[k]=array[k+1];
                  array[k+1]=temp;

              }
          }

      }

      System.out.println("Sequence sorted.......... ");
      for(int i=0; i<size; i++)
      {
          System.out.println(array[i]);
      }
      System.out.println("...................... ");

      return array;
  }

    public static void validateSameValue(int[] array){


        int index = array.length-1;

        int j;


        for (int i=0; i< index; i++){



            for(int k=i+1; k< index; k++){

                if (array[i] == array[k]){
                    System.out.println(" Two numbers in the sequence cannot be same!!!!");
                    System.out.println(" Please re-run the program!!!!");
                    System.exit(0);


                }
            }

        }





    }



    }



