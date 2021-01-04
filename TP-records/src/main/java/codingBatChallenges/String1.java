package codingBatChallenges;

public class String1 {

    //HELLO NAME
    public String helloName(String name) {
        return "Hello "+ name +"!";
    }

    //MAKE ABBA
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //MAKE TAGS
    public String makeTags(String tag, String word) {
        String start = "<"+tag+">";
        String end = "</"+tag+">";
        return start + word + end;
    }

    //MAKE OUT WORD
    public String makeOutWord(String out, String word) {
        int half = out.length()/2;
        String res = out.substring(0,half) + word + out.substring(half);
        return res;
    }

    //EXTRA END
    public String extraEnd(String str) {
        int len = str.length()-2;
        String sub = str.substring(len);
        return sub + sub + sub;
    }

    //FIRST TWO
    public String firstTwo(String str) {
        if(str.length()<2) return str;
        String sub = str.substring(0, 2);
        return sub;
    }

    //FIRST HALF
    public String firstHalf(String str) {
        int len = str.length()/2;
        return str.substring(0, len);
    }


    //WITHOUT END
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    //COMBO STRING
    public String comboString(String a, String b) {
        String res = (a.length()>b.length())? b+a+b : a+b+a;
        return res;
    }

    //NON START
    public String nonStart(String a, String b) {
        String a1=a.substring(1);
        String b1=b.substring(1);
        return a1 + b1;
    }

    //LEFT2
    public String left2(String str) {
        String sub = str.substring(0, 2);
        return str.substring(2)+ sub;
    }

    //RIGHT 2
    public String right2(String str) {
        String sub= str.substring(str.length()-2);
        return sub + str.substring(0, str.length()-2);
    }

    //THE END
    public String theEnd(String str, boolean front) {
        String res = (front)? str.charAt(0)+"": str.charAt(str.length()-1)+"";
        return res;
    }

    //WIHTOU END 2
    public String withouEnd2(String str) {
        if(str.length()<3) return "";
        return str.substring(1, str.length()-1);
    }

    //MIDDLE TWO
    public String middleTwo(String str) {
        return str.substring(str.length()/2-1, str.length()/2+1);
    }

    //ENDS LY
    public boolean endsLy(String str) {
        if(str.length()<2) return false;
        boolean res = (str.substring(str.length()-2).equals("ly")) ? true: false;
        return res;
    }

    //N TWICE
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length()-n);
    }

    //TWO CHAR
    public String twoChar(String str, int index) {
        if(str.length()<= index+1 || index<0) return str.substring(0, 2);
        return str.substring(index, index+2);
    }

    //MIDDLE THREE
    public String middleThree(String str) {
        String middleThree = str;
        if(str.length()>2){
            String middleLeft = str.charAt((str.length()/2)-1)+"";
            String middle = str.charAt(str.length()/2)+"";
            String middleRight = str.charAt((str.length()/2)+ 1)+"";
            str = middleLeft + middle + middleRight;
        }
        return str;
    }

    //HAS BAD
    public boolean hasBad(String str) {
        if (str.length()<4 && !str.equals("bad")) return false;
        if (str.length()<4 && str.equals("bad")) return true;
        String sub1 = str.substring(0,3);
        String sub2 = str.substring(1,4);
        if(sub1.equals("bad") || sub2.equals("bad")) return true;
        return false;
    }

    //AT FIRST
    public String atFirst(String str) {
        if(str.length()==0) return "@@";
        if(str.length()==1) return str+"@";
        return str.substring(0,2);
    }

    //LAST CHARS
    public String lastChars(String a, String b) {
        if(a.length()==0 && b.length()==0) return "@@";
        if(a.length()==0) return "@"+b.charAt(b.length()-1);
        if(b.length()==0) return a.charAt(0)+"@";
        return a.charAt(0) + b.substring(b.length()-1);
    }

    //CONCAT
    public String conCat(String a, String b) {
        if( a.length()>0 && b.length()>0 && a.charAt(a.length()-1) == b.charAt(0)) return a.substring(0, a.length()-1) + b;
        return a + b;
    }

    //LAST TWO
    public String lastTwo(String str) {
        if (str.length() < 2) {return str;}
        String sub = str.substring(0, str.length()-2);
        return sub + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }

    //SEE COLOR
    public String seeColor(String str) {
        if(str.length()>2 && str.substring(0, 3).equals("red")) return "red";
        if(str.length()>3 && str.substring(0, 4).equals("blue")) return "blue";
        return "";
    }

    //FRONT AGAIN
    public boolean frontAgain(String str) {
        if(str.length()>1 && str.charAt(0) == str.charAt(str.length()-2) && str.charAt(1) == str.charAt(str.length()-1)){
            return true;
        }
        return false;
    }

    //MIN CAT
    public String minCat(String a, String b) {
        int minlen = (a.length() > b.length()) ? b.length() : a.length();
        return a.substring(minlen) + b.substring(minlen);
    }

    //EXTRA FRONT
    public String extraFront(String str) {
        if(str.length()<2) return str+str+str;
        String sub = str.substring(0, 2);
        return sub+sub+sub;
    }

    //WITHOUT 2
    public String without2(String str) {
        String sub = "";
        if(str.length()>1){
            if(str.substring(0,2).equals(str.substring(str.length()-2))){
                sub = str.substring(2);
            } else {
                sub = str;
            }
        } else {
            sub = str;
        }
        return sub;
    }

    //DEFRONT
    public String deFront(String str) {
        String sub = "";
        if(str.length()<2) return str;
        if(str.length()>1 && str.charAt(0) == 'a')  sub += "a";
        if(str.charAt(1) =='b') sub+="b";
        return sub + str.substring(2);
    }

    //START WORD
    public String startWord(String str, String word) {
        if (str.length() == 0) {
            return "";
        }
        if (str.substring(1, str.length()).startsWith(word.substring(1, word.length()))) {
            return str.substring(0, word.length());
        }

        return "";
    }

    //WITHOUT X
    public String withoutX(String str) {
        String sub = "";
        int last = str.length()-1;
        if(str.length()> 1 && str.charAt(0) == 'x'){
            sub += str.substring(1, last);
            if(str.length()>1 && str.charAt(last) != 'x'){
                sub += str.charAt(last);
            }
            return sub;
        } else {
            if(str.length()>0 && str.charAt(last)=='x'){
                return str.substring(0, last);
            } else return str;
        }
    }

    //WITHOUT X2
    public String withoutX2(String str) {
        String res = "";
        if(str.length()>1 && str.charAt(1) =='x' && str.charAt(0)=='x') {
            return str.substring(2);
        }
        if(str.length()>1 && str.charAt(1) =='x'){
            return str.substring(0,1)+ str.substring(2);
        }
        if(str.length()>0 && str.charAt(0)=='x'){
            return str.substring(1);
        }
        return str;
    }
}
