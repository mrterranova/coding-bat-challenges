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

    //COUNT XX
    int countXX(String str) {
        int count = 0;
        for(int i=0; i< str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x') count++;
        }
        return count;
    }

    //DOUBLE X
    boolean doubleX(String str) {
        boolean doubleX = false;
        for(int i=0; i < str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x') {
                doubleX = true;
                i = i+2;
            }
            if(str.charAt(0) =='x' && str.charAt(1)!='x'){
                doubleX = false;
            }
        }
        return doubleX;
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

    //ARRAY COUNT 9
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] ==9)
                count++;
        }
        return count;
    }

    //ARRAY FRONT 9
    public boolean arrayFront9(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i<4 && nums[i]==9){
                return true;
            }
        }
        return false;
    }

    //ARRAY 123
    public boolean array123(int[] nums) {
        for(int i=1; i< nums.length-1; i++){
            if(nums[i]==2 && nums[i-1]==1 && nums[i+1]==3){
                return true;
            }
        }
        return false;
    }

    //STRING MATCH

    //STRING X
    public String stringX(String str) {
        if(str.length()==0) return str;
        String newStr = str.charAt(0)+"";
        for(int i=1; i< str.length(); i++){
            if(str.charAt(i)!='x' || i == str.length()-1){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    //ALT PAIRS
    public String altPairs(String str) {
        String newStr = "";
        if(str.length()<3) return str;
        for(int i=0; i < str.length(); i++){
            if(i%2==0 && i < str.length()-2){
                newStr += str.charAt(i);
                i++;
                newStr += str.charAt(i);
                i = i+2;
            } else {
                newStr+= str.charAt(i);
            }
        }
        return newStr;
    }

    //STRING YAK

    //ARRAY 667
    public int array667(int[] nums) {
        int count = 0;
        for(int i=1; i< nums.length; i++){
            if((nums[i-1]==6 && nums[i]==6 )||nums[i-1]==6 && nums[i]==7 ){
                count++;
            }
        }
        return count;
    }

    //NO TRIPLES
    public boolean noTriples(int[] nums) {
        boolean noTriples = true;
        for(int i=1; i < nums.length-1; i++){
            if(nums[i-1]== nums[i] && nums[i] == nums[i+1])
                noTriples = false;
        }
        return noTriples;
    }

    //HAS 271
}
