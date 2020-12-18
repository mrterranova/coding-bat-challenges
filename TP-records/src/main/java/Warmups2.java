public class Warmups2 {
    public static void main(String[] args) {
        //STRING TIMES
        //Count the number of "xx" in the given string. We'll say that overlapping
        // is allowed, so "xxx" contains 2 "xx".

        //FRONT TIMES
        //Given a string, return true if the first instance of "x" in the string
        // is immediately followed by another "x".

        //COUNT X
        //Count the number of "xx" in the given string. We'll say that overlapping
        // is allowed, so "xxx" contains 2 "xx".

        //DOUBLE X

        //STRING BITS
        //Given a string, return a new string made of every other char starting with
        // the first, so "Hello" yields "Hlo".

        //STRING SPLOSION
        //Given a non-empty string like "Code" return a string like "CCoCodCode".
    }

    //STRING TIMES
    public String stringTimes(String str, int n) {
        String stringTimes = str;

        for (int i= 0; i < n-1; i++){
            stringTimes += str;
        }
        if(n==0){
            stringTimes = "";
        }
        return stringTimes;
    }

    //FRONT TIMES
    public String frontTimes(String str, int n) {
        String frontTimes = "";

        for(int i = 0; i <n; i++){
            if(str.length()<3){
                frontTimes += str;
            } else {
                frontTimes += str.substring(0,3);
            }
        }
        return frontTimes;
    }

    //COUNT X
    int countXX(String str) {
        int count = 0;
        for(int i=0; i< str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x') count++;
        }
        return count;
    }

    //STRING BITS
    public String stringBits(String str) {
        String stringBits = "";
        for(int i=0; i< str.length(); i=i+2){
            stringBits += str.charAt(i)+"";
        }
        return stringBits;
    }

    //STRING SPLOSION
    public String stringSplosion(String str) {
        if(str.length() == 0) return str;
        return stringSplosion(str.substring(0, str.length()-1)) + str;
    }
}
