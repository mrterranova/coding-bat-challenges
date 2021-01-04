package codingBatChallenges;

public class Logic1 {

    //CIGAR PARTY
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if((!isWeekend && (cigars >=40 && cigars<=60))||(isWeekend && cigars >=40))
            return true;
        return false;
    }

    //DATE FASHION
    public static int dateFashion(int you, int date) {
        if(you<3 || date<3)return 0;
        if(you>7 || date>7) return 2;
        else return 1;
    }

    //SQUIRREL PLAY
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp>=60 && temp<=90 && !isSummer){
            return true;
        } else if(temp>=60 && temp<=100 && isSummer){
            return true;
        }else return false;
    }

    //CAUGHT SPEEDING
    public static int caughtSpeeding(int speed, boolean isBirthday) {
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
    public static int sortaSum(int a, int b) {
        int sum = a+b;
        if(sum>=10 && sum<=19) return 20;
        else return sum;
    }

    //ALARM CLOCK
    public static String alarmClock(int day, boolean vacation) {
        if((day==0 || day==6) && !vacation)
            return "10:00";
        else if((day>0 && day<6) && !vacation)
            return "7:00";
        else if((day>0 && day<6) && vacation)
            return "10:00";

        else return "off";
    }

    //LOVE 6
    public static boolean love6(int a, int b) {
        if(a ==6 || b==6) return true;
        if(Math.abs(a-b) ==6 || a+b==6) return true;
        return false;
    }

    //



}
