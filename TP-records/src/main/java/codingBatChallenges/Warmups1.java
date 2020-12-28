package codingBatChallenges;

public class Warmups1 {
    public static void main(String[] args) {

        //SLEEP IN
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true
        //if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return
        //true if we sleep in.

        //MONKEY TROUBLE
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is
        //smiling. We are in trouble if they are both smiling or if neither of them is smiling.
        //Return true if we are in trouble.

        //SUM DOUBLE
        //Given two int values, return their sum. Unless the two values are the same, then return
        //double their sum.

        //DIFF 21
        //Given an int n, return the absolute difference between n and 21, except return double the
        //absolute difference if n is over 21.

        //PARROT TROUBLE
        //We have a loud talking parrot. The "hour" parameter is the current hour time in the range
        //0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        //Return true if we are in trouble.

        //MAKES 10
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

        //NEAR HUNDRED
        //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
        //computes the absolute value of a number.

        //POS NEG
        //Given 2 int values, return true if one is negative and one is positive. Except
        //if the parameter "negative" is true, then return true only if both are negative.

        //

    }

    //SLEEP IN
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn = false;
        if(weekday == false){
            sleepIn = true;
        }
        if(vacation == true){
            sleepIn = true;
        }
        return sleepIn;
    }

    //MONKEY TROUBLE
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean monkeyTrouble = false;

        if ((aSmile == false && bSmile == false) || (aSmile == true && bSmile == true)){
            monkeyTrouble = true;
        }
        return monkeyTrouble;
    }

    //SUM DOUBLE
    public int sumDouble(int a, int b) {
        int sumDouble = 0;

        if(a == b){
            sumDouble = (a+b)*2;
        } else {
            sumDouble = (a+b);
        }
        return sumDouble;
    }

    //DIFF 21
    public int diff21(int n) {
        int diff21 = 0;

        if(n<0){
            diff21 = (n*-1)+21;
        } else if (n>-1 && n<22){
            diff21 = 21-n;
        } else {
            diff21 = (n-21)*2;
        }
        return diff21;
    }

    //PARROT TROUBLE
    public boolean parrotTrouble(boolean talking, int hour) {
        boolean parrotTrouble = false;

        if((talking == true && hour < 7) || (talking == true && hour > 20)){
            parrotTrouble = true;
        }
        return parrotTrouble;
    }


    //MAKES 10
    public boolean makes10(int a, int b) {
        boolean makes10 = false;

        if ((a==10)||(b==10)||(a+b ==10)){
            makes10 = true;
        }
        return makes10;
    }

    //NEAR HUNDRED
    public boolean nearHundred(int n) {
        boolean nearHundred = false;

        if(Math.abs(100-n) <=10 || Math.abs(200-n) <=10){
            nearHundred = true;
        }
        return nearHundred;
    }

    //POS NEG
    public boolean posNeg(int a, int b, boolean negative) {
        boolean posNeg = false;

        if (a <0 && b<0) {
            if (negative){
                posNeg = true;
            }
        } else if (a < 0 || b < 0){
            if (!negative){
                posNeg = true;
            }
        }
        return posNeg;
    }

    //NOT STRING
    public String notString(String str) {
        String notString = str;
        if (str.length() >2 && str.substring(0,3).equals("not")){
            notString = str;
        } else {
            notString = "not "+str;
        }
        return notString;
    }

    //MISSING CHAR
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1);
    }

    //FRONT BACK
    public String frontBack(String str) {
        if(str.length()==1 || str.length()==0) return str;
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1)+ str.charAt(0);
    }

    //FRONT 3
    public String front3(String str) {
        if (str.length()< 3) return str+str+str;
        String sub = str.substring(0,3);
        return sub+sub+sub;
    }

    //BACK AROUND
    public String backAround(String str) {
        char sub = str.charAt(str.length()-1);
        return sub + str +sub;
    }

    //OR 35
    public boolean or35(int n) {
        if(n>=0 && (n%3==0 || n%5==0) ) return true;
        return false;
    }

    //FRONT 22
    public String front22(String str) {
        if(str.length()<2) return str+str+str;
        String sub = str.substring(0,2);
        return sub+str+sub;
    }

    //START HI
    public boolean startHi(String str) {
        if(str.length()>1 && str.substring(0,2).equals("hi")) return true;
        return false;
    }

    //ICY HOT
    public boolean icyHot(int temp1, int temp2) {
        boolean a = false;
        boolean b = false;

        if(temp1 < 0 && temp2 > 100) return true;
        if(temp2 < 0 && temp1 > 100) return true;
        return false;
    }

    //IN 1020
    public boolean in1020(int a, int b) {
        if((a >=10 && a <=20) ||( b >=10 && b <=20)) return true;
        return false;
    }

    //HAS TEEN
    public boolean hasTeen(int a, int b, int c) {
        int[] nums = { a, b, c};
        for(int i=0; i < nums.length; i++){
            if(nums[i] >=13 && nums[i] <=19)
                return true;
        }
        return false;
    }

    //LONE TEEN
    public boolean loneTeen(int a, int b) {
        if(a>=13 && a<=19){
            if(b>=13 && b<=19){
                return false;
            } else{
                return true;
            }
        } else if(b>=13 && b<=19){
            if(a>=13 && a<=19){
                return false;
            } else{
                return true;
            }
        } else {
            return false;
        }
    }

    //DEL DEL
    public String delDel(String str) {
        if(str.length()<4){
            return str;
        }
        String sub = str.substring(1,4);
        if(sub.equals("del")){
            str = str.substring(0,1) + str.substring(4);
        }
        return str;
    }

    //MIX START
    public boolean mixStart(String str) {

        if(str.length()>=3 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }


    //START OZ
    public String startOz(String str) {
        String res = "";
        if (str.length() >= 1 && str.charAt(0)=='o')
            res +=str.charAt(0);
        if (str.length() >= 2 && str.charAt(1)=='z')
            res += str.charAt(1);
        return res;
    }

    //INT MAX
    public int intMax(int a, int b, int c) {
        int result = 0;
        if (a>b && a>c) return a;
        if (b>a && b>c) return b;
        if (c>a && c>b) return c;

        return result;
    }

    //CLOSE 10
    public int close10(int a, int b) {
        if (Math.abs(10-a)< Math.abs(10-b)){
            return a;
        } else if (Math.abs(10-a)> Math.abs(10-b)){
            return b;
        } else {
            return 0;
        }
    }


    //IN 3050
    public boolean in3050(int a, int b) {
        boolean in3050 = false;

        if ((a >=30 && a <= 40 && b>=30 && b<=40)||(b >=40 && b<=50 && a>=40 && a <=50)){
            return true;
        }
        return false;
    }

    //MAX 1020
    public int max1020(int a, int b) {

        if(a>=10 && a<=20 && b>=10 && b<=20){
            if(a>b){
                return a;
            } else {
                return b;
            }
        } else if ((a>=10 && a<=20) && (b<10 ||b>20)) {
            return a;
        } else if ((b>=10 && b<=20) && (a<10 ||a>20)) {
            return b;
        }
        return 0;
    }

    //STRING E
    public boolean stringE(String str) {
        int count = 0;
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        if (count >3 || count < 1){
            return false;
        }
        return true;
    }

    //LAST DIGIT
    public boolean lastDigit(int a, int b) {

        if (a%10 ==b%10){
            return true;
        }
        return false;
    }

    //END UP
    public String endUp(String str) {
        if(str.length()>3){
            return str.substring(0,str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
        }
        return str.toUpperCase();
    }

    //EVERY NTH
    public String everyNth(String str, int n) {
        String everyNth = "";
        for (int i=0; i<str.length(); i++){
            if (i % n == 0){
                everyNth +=str.charAt(i);
            }
        }
        return everyNth;
    }
}
