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

}
