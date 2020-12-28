public class Logic1 {
    public static void main(String[] args) {

    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if((!isWeekend && (cigars >=40 && cigars<=60))||(isWeekend && cigars >=40))
            return true;
        return false;
    }
    public int dateFashion(int you, int date) {
        if(you<3 || date<3)return 0;
        if(you>7 || date>7) return 2;
        else return 1;
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp>=60 && temp<=90 && !isSummer){
            return true;
        } else if(temp>=60 && temp<=100 && isSummer){
            return true;
        }else return false;
    }
    
}
