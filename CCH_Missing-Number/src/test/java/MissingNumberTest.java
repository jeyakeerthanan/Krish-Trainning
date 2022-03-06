import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingValue() {
        //missing middle values
        int[] array= new int[3];
        array[0]= 4;
        array[1]= 6;
        array[2]= 7;
        MissingNumber obj = new MissingNumber(array);
        assertEquals(5, obj.missingValue(array));

    }

    @Test
    public void missingMiddleValue() {
        //missing first or last values in the sequence
        int[] array= new int[3];
        array[0]= 4;
        array[1]= 6;
        array[2]= 5;
        MissingNumber obj = new MissingNumber(array);
        assertEquals(0, obj.missingValue(array));

    }


    @Test
    public void sortSequence() {
        //missing first or last values in the sequence
        int[] array= new int[3];
        array[0]= 4;
        array[1]= 6;
        array[2]= 5;
        MissingNumber obj = new MissingNumber(array);
        int[] s_array;
        s_array= new int[]{4, 5, 6};
        assertEquals( s_array[0], obj.sortSequence(array,3)[0]);
        assertEquals( s_array[1], obj.sortSequence(array,3)[1]);
        assertEquals( s_array[2], obj.sortSequence(array,3)[2]);
    }

    @Test
    public void validateSameValue() {
        //validate same value
        int[] array= new int[3];
        array[0]= 4;
        array[1]= 3;
        array[2]= 4;

        assertEquals( 0,   MissingNumber.validateSameValue(array));

    }
}