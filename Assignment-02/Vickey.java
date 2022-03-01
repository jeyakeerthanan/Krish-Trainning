import java.util.*; 
public class Vickey{

public static void main (String[] args){

	int distance;
    	int count=0;

	
	Scanner sc= new Scanner(System.in); 
   
	System.out.print("Please Enter the distance.... ");  
	distance= sc.nextInt();  

	while(true)
	{
		  if ( distance > 0 ){
			
			distance = distance-5;

				if ( distance > 0 ){

		        	count = count+1;

				}else break;

		} else break;

			
		if ( distance > 0 ){
			
			distance = distance-3;

				if ( distance > 0 ){

		       		 count = count+2;

				}else break;
		       

		} else break;

			
		if ( distance > 0 ){
			
			distance = distance-1;

				if ( distance > 0 ){

		        	  count = count+3;

				}else break;
		        

		} else break;
	}
		

	    System.out.println( "Frog will take" + " " + count + " " +"seconds.");		

	}
}