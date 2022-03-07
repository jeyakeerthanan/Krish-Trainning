import java.util.Scanner;

public class Application {

    public static void main (String [] args){


        int [] counting;
        char[] C_alphabet;


        //user input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = sc.nextLine();


        paragraph = paragraph.replaceAll("\\s+","");
        paragraph=paragraph.toUpperCase();

        Occurance obj = new Occurance();
        C_alphabet = obj.loadAlphabets(obj.getC_alphabet());
        obj.setParagraph(paragraph);
        counting= obj.CountingAlphabets(obj.getParagraph(),C_alphabet,obj.getCounting());

        obj.printAlphabets(C_alphabet,counting);






    }
}
