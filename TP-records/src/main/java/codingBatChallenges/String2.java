package codingBatChallenges;

public class String2 {
    //DOUBLE CHAR
    public String doubleChar(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++){
            res += str.charAt(i);
            res+= str.charAt(i);
        }
        return res;
    }

    //COUNT HI
    public int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    //CATDOG
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        if(str.length()<3) return true;
        if(str.length()<6) return false;
        int len = str.length()-2;
        for(int i=0; i< str.length(); i++){
            if( i < len && str.substring(i, i+3).equals("cat")){
                cat++;
            }
            if(i < len && str.substring(i, i+3).equals("dog")){
                dog++;
            }
        }
        if(cat==dog)return true;
        return false;
    }

    //COUNT CODE
    public int countCode(String str) {
        int count = 0;
        if(str.length()< 4) return 0;
        for(int i =0; i< str.length()-3; i++){
            int one = i+1;
            int three = i+3;
            if(str.charAt(i)=='c' && str.charAt(one)=='o' && str.charAt(three)=='e'){
                count++;
            }
        }
        return count;
    }

    //END OTHER
    public boolean endOther(String a, String b) {
        String min, max;
        if(a.length()<b.length()) {
            min = a.toLowerCase(); max = b.toLowerCase();
        }else{
            min = b.toLowerCase(); max = a.toLowerCase();
        }
        int dist = max.length()-min.length();
        String sub = max.substring(dist);
        if(min.equals(sub)) return true;
        return false;
    }

    //XYZ THERE
    public boolean xyzThere(String str) {
        if(str.contains(".xyz") && str.contains("xyz")) return true;
        if(str.contains(".xyz")) return false;
        else if(str.contains("xyz")) return true;
        else return false;
    }

    //BOB THERE
    public boolean bobThere(String str) {
        if(str.length()<3) return false;
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i-1) =='b' && str.charAt(i+1)=='b')
                return true;
        }
        return false;
    }

    //XY BALANCE
    public boolean xyBalance(String str) {
        int x = 0;
        int y = 0;
        if(str.length()==0) return true;
        if(str.length()<1 && str.charAt(0)!= 'y') return false;
        if(str.length()<1 && str.charAt(0)== 'y') return true;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)=='y'&& str.charAt(i-1)=='x') return true;
        }
        return false;
    }

    //MIX STRING

    //REPEAT END

    //REPEAT FRONT

    //REPEAT SEPARATOR

    //PREFIX AGAIN

    //XYZ MIDDLE

    //GET SANDWICH

    //SAME STAR CHAR
    public boolean sameStarChar(String str) {
        boolean res = true;
        if(str.length()<3 && str != "" && !str.contains("*")){
            res = false;
        }

        for(int i=1; i< str.length()-1; i++){
            if(str.charAt(i) == '*' && str.charAt(i-1)!= str.charAt(i+1)){
                res = false;
            }
        }
        return res;
    }

    //ONE TWO
    public String oneTwo(String str) {
        String sub = "";
        for(int i=0; i< str.length(); i++){
            if( i%3 ==0 && i<str.length()-2){
                sub += str.substring(i+1, i+3) + str.charAt(i);
            }
        }
        return sub;
    }

    //ZIP ZAP
    public String zipZap(String str) {
        if(str.length()<3) return str;
        String sub = str.charAt(0)+"";
        for(int i=1; i < str.length()-1; i++){
            if(str.charAt(i-1)=='z' && str.charAt(i+1) != 'p'){
                sub += str.charAt(i);
            } else if (str.charAt(i-1) != 'z'){
                sub+= str.charAt(i);
            }
        }
        return sub + str.charAt(str.length()-1);
    }

    //STAR OUT

    //PLUS OUT

    //WORD ENDS

}
