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
    public String sameEnds(String str) {
        String res = "";
        String sub ="";
        if (str.length()<=1) return "";
        int half = str.length()/2;
        char start = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            sub += str.charAt(i);
            if(i < half && sub.equals(str.substring(str.length()-sub.length()))){
                res = sub;
            }
        }
        return res;
    }

    //MIRROR ENDS
    public String mirrorEnds(String str) {
        String res = "";
        String sub1 = "";
        for(int i=0; i<str.length(); i++){
            sub1 += str.substring(i, i+1);
            String temp = "";
            for(int j= sub1.length()-1; j >=0; j--){
                temp += sub1.substring(j, j+1);
                if(temp.equals(str.substring(str.length()-i-1, str.length())))
                    res = sub1;
            }
        }
        return res;
    }

    //MAX BLOCK
    public int maxBlock(String str) {
        int block = 0, start = 0, end = 0;
        int temp = 0;
        if(str.length()==0) return 0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                temp++;
                if(temp> block){
                    block = temp;
                }
            } else{
                temp = 0;
            }
        }
        return block+1;
    }

    //SUM NUMBERS
    public int sumNumbers(String str) {
        int res = 0;
// for(int i=0; i< str.length(); i++){
//     String e = "";
//     char s = str.charAt(i);
//     if(Character.isDigit(s)){
//       for(int j=0; j< str.length(); j++){
//         if(Character.isDigit(j)){
//           e += str.charAt(j)+"";
//         } else{
//           i = i+j;
//           break;
//         }
//       }
//       res += Integer.parseInt(e);
//     }
// }


// go through each character on the string
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            String temp = "";
            if (i < str.length() && Character.isDigit(s)) {
                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) {
                        temp += str.charAt(j) + "";
                        i++;
                    } else {
                        break;
                    }
                }
                res += Integer.parseInt(temp);
            }
        }
// if a character is a digit
// determine if adjacent characters are digits and append
// returned appended digits and convert to int
// add them to sum

        return res;
    }

    //NOT REPLACE
        public String notReplace(String str) {
            String res = "";
            if(str.equals("is")) return "is not";
            //iterate through string
            for(int i=0; i< str.length()-2; i++){
                //determine if "is" is in the word
                //is should not be proceeded by letters
                String sub = str.substring(i, i+2);
                //is should not be proceeded by letters
                //if "is" is in word, create substring
                // add "not" and finish word
                if(sub.equals("is") && i>0 && i < str.length()-1 && !Character.isLetter(str.charAt(i+2)) && !Character.isLetter(str.charAt(i-1))){
                    res += "is not";
                    i++;
                } else if (sub.equals("is") && i==0 && !Character.isLetter(str.charAt(i+2))) {
                    res+= "is not";
                    i++;
                } else {
                    res+= str.charAt(i);
                }
            }
            if(str.length()>2){
                if(!Character.isLetter(str.charAt(str.length()-3)) && str.charAt(str.length()-2)=='i' && str.charAt(str.length()-1)=='s')
                    res+= "is not";
                else res+= str.substring(str.length()-2);
            }
            return res;

        }
}
