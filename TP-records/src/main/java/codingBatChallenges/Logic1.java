package codingBatChallenges;

public class Logic1 {

    //CIGAR PARTY
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if((!isWeekend && (cigars >=40 && cigars<=60))||(isWeekend && cigars >=40))
            return true;
        return false;
    }

    //DATE FASHION
    public int dateFashion(int you, int date) {
        if(you<3 || date<3)return 0;
        if(you>7 || date>7) return 2;
        else return 1;
    }

    //SQUIRREL PLAY
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp>=60 && temp<=90 && !isSummer){
            return true;
        } else if(temp>=60 && temp<=100 && isSummer){
            return true;
        }else return false;
    }

    //CAUGHT SPEEDING
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(!isBirthday){
            if(speed<=60) return 0;
            else if(speed <=80) return 1;
            else return 2;
        } else{
            if(speed<=65) return 0;
            else if(speed <=85) return 1;
            else return 2;
        }
    }

    //SORTA SUM
    public int sortaSum(int a, int b) {
        int sum = a+b;
        if(sum>=10 && sum<=19) return 20;
        else return sum;
    }

    //ALARM CLOCK
    public String alarmClock(int day, boolean vacation) {
        if((day==0 || day==6) && !vacation)
            return "10:00";
        else if((day>0 && day<6) && !vacation)
            return "7:00";
        else if((day>0 && day<6) && vacation)
            return "10:00";

        else return "off";
    }

    //LOVE 6
    public boolean love6(int a, int b) {
        if(a ==6 || b==6) return true;
        if(Math.abs(a-b) ==6 || a+b==6) return true;
        return false;
    }

    //IN 1 TO 10
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            if(n <= 9 && n >=2) return false;
            else return true;
        } else {
            if(n<=10 && n>=1) return true;
            else return false;
        }
    }

    //SPECIAL ELEVEN
    public boolean specialEleven(int n) {
        if(n%11 == 0 || n%11 == 1) return true;
        else return false;
    }

    //MORE 20
    public boolean more20(int n) {
        if(n%20 ==1 || n%20 ==2) return true;
        return false;
    }

    //OLD 35
    public boolean old35(int n) {
        if((n%3==0 || n%5==0) && !(n%3==0 && n%5==0) ){
            return true;
        }
        return false;
    }

    //LESS 20
    public boolean less20(int n) {
        if(n%20 == 19 || n%20 == 18) return true;
        else return false;
    }

    //NEAR 10
    public boolean nearTen(int num) {
        boolean res = false;
        if(num%10==2 || num%10==1 || num%10 ==0 || num%10==9 || num%10==8){
            res = true;
        }
        return res;
    }

    //TEEN SUM
    public int teenSum(int a, int b) {
        if(a >=13 && a <=19 || b >=13 && b <=19) return 19;
        else return a+b;
    }

    //ANSWER CELL
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(!isAsleep){
            if(isMorning && isMom){
                return true;
            } else if(isMorning && !isMom){
                return false;
            } else {
                return true;
            }
        } else{
            return false;
        }
    }

    //TEA PARTY
    public int teaParty(int tea, int candy) {
        if(tea >= 5 && candy>=5){
            if(tea >= candy*2 || candy >= tea*2){
                return 2;
            }
            return 1;
        } else {
            return 0;
        }
    }

    //FIZZ STRING
    public String fizzString(String str) {
        if(str.startsWith("f") && str.contains("b")){
            return "FizzBuzz";
        } else if(str.startsWith("f")){
            return "Fizz";
        } else if(str.charAt(str.length()-1)=='b'){
            return "Buzz";
        } else {
            return str;
        }
    }

    //FIZZ STRING 2
    public String fizzString2(int n) {
        if(n%3==0 && n%5==0){
            return "FizzBuzz!";
        }else if(n%3==0){
            return "Fizz!";
        } else if(n%5==0){
            return "Buzz!";
        } else {
            return n+"!";
        }
    }

    //TWO AS ONE
    public boolean twoAsOne(int a, int b, int c) {
        if(a+b==c || b+c==a || a+c==b) return true;
        else return false;
    }

    //IN ORDER
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(bOk){
            if(c>b) return true;
            else return false;
        } else {
            if(b>a && c>b) return true;
            return false;
        }
    }

    //IN ORDER EQUAL
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk){
            if(a<=b && b<=c) return true;
            else return false;
        } else {
            if(a<b && b<c) return true;
            else return false;
        }
    }

    //LAST DIGIT
    public boolean lastDigit(int a, int b, int c) {
        if(a%10==b%10 ||c%10==b%10||a%10==c%10 ) return true;
        else return false;
    }

    //LESS BY 10
    public boolean lessBy10(int a, int b, int c) {
        if(Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(c-a)>=10) return true;
        else return false;
    }

    //WITHOUT DOUBLES
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int res = die1+die2;
        if(noDoubles){
            if(die1==die2 && die1!=6) return res+1;
            else if(die1==die2 && die1==6) return res-5;
            else return res;
        } else {
            return res;
        }
    }

    //MAX MOD 5
    public int maxMod5(int a, int b) {
        if(a==b) return 0;
        if(a%5==b%5){
            if(a<b) return a;
            else return b;
        } else{
            if(a>b) return a;
            else return b;
        }
    }

    //RED TICKET
    public int redTicket(int a, int b, int c) {
        if(a==b && b==c && c==2) return 10;
        else if(a==b && b==c) return 5;
        else if(a+b+c ==10) return 2;
        else if( b!=a && c!=a) return 1;
        else return 0;
    }

    //GREEN TICKET
    public int greenTicket(int a, int b, int c) {
        if(a==b && b==c) return 20;
        else if(a==b && a !=c || a==c && a !=b || b==c && a !=b){
            return 10;
        } else return 0;
    }

    //BLUE TICKET
    public int blueTicket(int a, int b, int c) {
        if(a+b==10 || a+c==10 || b+c==10){
            return 10;
        } else if(a+b >= b+c+10 || a+b >= a+c+10) {
            return 5;
        } else{
            return 0;
        }
    }

    //SHARE DIGIT
    public boolean shareDigit(int a, int b) {
        int a1=a%10, a2=a/10, b1=b%10, b2=b/10;
        if(a1 == b1 || a2==b2 || a1==b2 || b1==a2) return true;
        else return false;
    }

    //SUM LIMIT
    public int sumLimit(int a, int b) {
        String convertedA = String.valueOf(a);
        int lenA = convertedA.length();
        String convertedRes = String.valueOf(a+b);
        int lenRes = convertedRes.length();
        if(lenRes > lenA) return a;
        else return a+b;
    }
}
