public class Afternoon12920 {
    public static void main(String[] args) {
        //CODING BAT INSTRUCTIONS...
        System.out.println(makeBricks(2, 5, 10));//true
        System.out.println(makeBricks(2,5,15));//false
    }

    static boolean makeBricks(int small, int big, int goal) {
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

        int bigBricksUsed = goal/5;
        if(bigBricksUsed > big){
            bigBricksUsed = big;
        }
        goal -= bigBricksUsed *5;

        int smallBricksUsed = goal;
        if(smallBricksUsed > small){
            smallBricksUsed = small;
        }

        goal -= smallBricksUsed*1;
        if (goal == 0) return true;
        return false;
    }

}
