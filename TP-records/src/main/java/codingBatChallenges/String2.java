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
        boolean counts = false;
        if(str.length()<4 && str.equals("xyz")) return true;
        if(str.length()<4 && !str.equals("xyz")) return false;
        if(str.substring(0, 3).equals("xyz")) counts=true;
        for(int i=0; i<str.length()-3; i++){
            String sub = str.substring(i, i+4);
            if(sub.charAt(0) != '.' && sub.substring(1).equals("xyz")){
                counts = true;
            }
        }
        return counts;

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
        boolean res =false;
        if(str.length()<1) return true;
        int tempx = -1, tempy = -1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'x'){
                tempx = i;
            } else if(str.charAt(i) =='y'){
                tempy = i;
            }
            if(tempx<= tempy){
                res=true;
            }else{
                res= false;
            }
        }
        return res;
    }

    //MIX STRING
    public String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());
        String res="";
        for(int i =0; i< min; i++ ){
            res += a.charAt(i);
            res += b.charAt(i);
        }
        if(a.length()== min) res+= b.substring(min);
        else res+= a.substring(min);
        return res;
    }

    //REPEAT END
    public String repeatEnd(String str, int n) {
        String sub = str.substring(str.length()-n);
        String res = "";
        for(int i=0;i<n; i++){
            res += sub;
        }
        return res;
    }

    //REPEAT FRONT
    public String repeatFront(String str, int n) {
        String res = "";
        int count = n;
        for(int i=0; i<n; i++){
            String sub = str.substring(0, count);
            res += sub;
            count--;
        }
        return res;
    }

    //REPEAT SEPARATOR
    public String repeatSeparator(String word, String sep, int count) {
        String res = "";
        if(count == 0) return res;
        for(int i=0; i<count-1; i++){
            res += word;
            res += sep;
        }
        return res + word;
    }

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
