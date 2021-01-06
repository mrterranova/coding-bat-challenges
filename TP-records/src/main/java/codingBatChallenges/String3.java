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
    public String withoutString(String base, String remove) {
        base = base.replace(remove.toLowerCase(), "");
        base = base.replace(remove.toUpperCase(), "");
        base = base.replace(remove, "");
        return base;
    }
    //EQUAL IS NOT
    public boolean equalIsNot(String str) {
        int countIs=0, countNot=0;
        for(int i=0; i<str.length()-1; i++){
            if(i<str.length()-2){
                String not = str.substring(i, i+3);
                if(not.equals("not")){
                    countNot++;
                }
            }
            String is = str.substring(i, i+2);
            if(is.equals("is")){
                countIs++;
            }
        }
        return countNot == countIs;
    }

    //G HAPPY
    public boolean gHappy(String str) {
        boolean happyG = true;
        for(int i=0; i<str.length(); i++){
            if(i<str.length()-1 && str.substring(i, i+2).equals("gg")){
                i= i+2;
            } else if(str.charAt(i)=='g'){
                happyG = false;
            }
        }
        return happyG;
    }

    //COUNT TRIPLE
    public int countTriple(String str) {
        int triples = 0;
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i-1)==str.charAt(i) && str.charAt(i)==str.charAt(i+1)){
                triples ++;
            }
        }
        return triples;
    }

    //SUM DIGITS
    public int sumDigits(String str) {
        int res = 0;
        for(int i=0; i< str.length(); i++){
            char n = str.charAt(i);
            if(Character.isDigit(n)){
                res += Integer.parseInt(n+"");
            }
        }
        return res;
    }
    //SAME ENDS

    //MIRROR ENDS

    //MAX BLOCK

    //SUM NUMBERS

    //NOT REPLACE

}
