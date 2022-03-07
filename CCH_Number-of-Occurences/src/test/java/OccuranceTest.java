import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceTest {


    @Test
    public void loadAlphabets() {
        char[] C_alphabet = new char[26];
        char[] result = new char[26];
        result[0] = 'A';
        result[25] = 'Z';
        Occurance obj = new Occurance();
        C_alphabet = obj.loadAlphabets(obj.getC_alphabet());
        assertEquals( result[0] ,C_alphabet[0]);
        assertEquals( result[25] ,C_alphabet[25]);


    }

    @Test
    public void countingAlphabets() {
        char[] C_alphabet = new char[26];
        int[] result = new int[26];
        int [] counting;
        String paragraph= "hello";
        //A count =1 & E count = 3
        result[0]=0;
        result[4]=3;
        Occurance obj = new Occurance();
        C_alphabet = obj.loadAlphabets(obj.getC_alphabet());
        obj.setParagraph(paragraph);
        counting= obj.CountingAlphabets(obj.getParagraph(),C_alphabet,obj.getCounting());

        assertEquals( result[0] ,counting[0]);
        assertEquals( result[5] ,counting[5]);
    }


}