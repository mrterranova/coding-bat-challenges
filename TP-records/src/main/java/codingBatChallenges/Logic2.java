package codingBatChallenges;

public class Logic2 {
    public static void main(String[] args) {

    }

    //MAKE BRICKS
    public boolean makeBricks(int small, int big, int goal) {
        //with boolean outputs assume the hard thing to prove
        //then do the "easy" check to flip the value if needed

        //possible approaches
        //try every combination of bricks and see if any of them work
        //probably slow

        //loop through big bricks until we run out

        // if (small*1 + big*5 >= goal) {
        //   int res = (small*1 + big*5)-goal;
        //   if (res == 0 ) return true;
        //   if (goal > res && res > 5 && small > res) {
        //     return true;
        //   }
        // }
        // return false;

        int bigBricksUsed = goal / 5;
        if (bigBricksUsed > big) {
            bigBricksUsed = big;
        }
        goal -= bigBricksUsed * 5;

        int smallBricksUsed = goal;
        if (smallBricksUsed > small) {
            smallBricksUsed = small;
        }

        goal -= smallBricksUsed * 1;
        if (goal == 0) return true;
        return false;
    }

    //LONE SUM
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (a == c) return b;
        return a + b + c;
    }

    //LUCKY SUM
    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }

    //NO TEEN SUM
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public int fixTeen(int n){
        if(n>=13 && n <=19 && !(n==15 || n==16)) return 0;
        else return n;
    }

    //ROUND SUM
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int n){
        if(n%10 >=5){
            return n/10*10 + 10;
        } else {
            return n/10*10;
        }
    }

    //CLOSE FAR
    public boolean closeFar(int a, int b, int c) {
        boolean nearb = false, nearc = false, farb = false, farc = false;
        if(Math.abs(b-a) <= 1){
            nearb = true;
        } else if(Math.abs(b-a) >=2 && Math.abs(b-c)>=2) {
            farb = true;
        }
        if(Math.abs(c-a) <= 1) {
            nearc = true;
        } else if(Math.abs(c-a) >=2 && Math.abs(b-c)>=2) {
            farc = true;
        }
        if(nearb && farc) return true;
        if(farb && nearc) return true;
        return false;
    }

    //BLACK JACK

    //EVENLY SPACED

    //MAKE CHOCOLATE
    
}
