public class Occurance {

   private int [] counting=new int[26];
   private char[] C_alphabet = new char[26];
   private  String paragraph;

    public int[] getCounting() {
        return counting;
    }

    public void setCounting(int[] counting) {
        this.counting = counting;
    }

    public char[] getC_alphabet() {
        return C_alphabet;
    }

    public void setC_alphabet(char[] c_alphabet) {
        C_alphabet = c_alphabet;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public char[] loadAlphabets(char[] C_alphabet) {
     // load alphabets
     int count = 0;
     int k=0;
     int j=0;

     for (char i = 'A'; i <= 'Z'; ++i) {
         if (count == 1)
             j++;

         for (; k <= j; k++) {
             C_alphabet[k] = i;
             count = 1;
         }

        }
        return C_alphabet;
    }


    public int [] CountingAlphabets(String paragraph, char[] C_alphabet, int[] counting) {
        //counting
        int counting_letters=0;
        for (int i = 0; i < C_alphabet.length; i++) {
            if (counting_letters != 0) {
                counting[i - 1] = counting_letters;
                counting_letters = 0;
            }

            for (int x = 0; x < this.paragraph.length(); x++) {
                if (paragraph.charAt(x) == C_alphabet[i])
                    counting_letters++;
            }
        }


        return counting;
    }

    public void printAlphabets(char[] C_alphabet, int[] counting) {
        //print counts
        System.out.println("***** Printing Letter Counts*****");
        for (int y = 0; y < C_alphabet.length; y++) {
            System.out.println(C_alphabet[y] + ": " + counting[y]);
        }
    }

}
