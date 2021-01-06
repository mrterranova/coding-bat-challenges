package codingBatChallenges;

public class String3 {
    //COUNT YZ
    public int countYZ(String str) {
        int count = 0;
        for(int i=1; i< str.length(); i++){
            char test = str.charAt(i);
            if(!Character.isLetter(test) && (Character.toLowerCase(str.charAt(i-1))=='y' || Character.toLowerCase(str.charAt(i-1))=='z')){
                count++;
            }
        }
        if( Character.toLowerCase(str.charAt(str.length()-1)) =='y'|| Character.toLowerCase(str.charAt(str.length()-1))=='z'){
            count++;
        }
        return count;
    }

    //WITHOUT STRING

    //EQUAL IS NOT

    //G HAPPY

    //COUNT TRIPLE

    //SUM DIGITS

    //SAME ENDS

    //MIRROR ENDS

    //MAX BLOCK

    //SUM NUMBERS

    //NOT REPLACE

}
