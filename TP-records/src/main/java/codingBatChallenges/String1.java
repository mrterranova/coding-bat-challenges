package codingBatChallenges;

public class String1 {
    public static void main(String[] args) {

    }

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

    //TWO CHAR

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

}
