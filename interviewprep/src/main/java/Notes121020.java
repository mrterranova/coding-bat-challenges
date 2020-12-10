public class Notes121020 {
    public static void main(String[] args) {

//        int[] arr = {9,7,2,9,7,7,8,6,9,5,8,8,7,7,2,6,4,3,5,7,1,2,8,5,9,7,3,0,0,5,8,9,4,4,7,3,6,7,6,3,0,8,2,1,1,9,5,9,7,8,4,7,6,5,3,6,0,9,9,4,1,0,5,8,2,4,7,3,3,6,0,8,3,4,6,6,4,3,6,9,5,0,1,6,0,9,0,5,9,0,4,8,3,5,7,1,5,1,7,5};
//        int[] arr1 = {6,5,3,8,7,4,8,8,0,8,9,3,2,1,3,8,0,9,1,8,2,8,9,4,2,1,5,0,9,2,6,5,7,1,9,7,7,3,2,8,4,9,9,6,5,8,2,7,0,2,3,7,1,5,8,9,2,5,6,8,7,6,1,6,7,9,1,2,5,1,5,0,7,7,8,3,6,4,1,4,7,5,2,9,4,5,2,8,9,1,1,2,4,6,5,5,2,8,7,2};
//
//        int[] arr2 = {9,9,9};
//        int[] arr3 = {9,9,9};
//        int[] res = latticeMultiplyExample(arr2, arr3);
//        for (int i = res.length-1; i >=0; i--) {
//            System.out.print(res[i]);
//        }
        double[] toSort = { 2.3, 4.5, 3.2, 1.8};
        System.out.println(findInsertLocationRecursive(toSort, 0.38, 0, toSort.length-1));
    }
    //completed from morning
    static int[] latticeMultiplyExample(int[] x1, int[] x2){
        int[] output = new int[x1.length+x2.length];
        for (int i = 0; i <x1.length ; i++) {
            for (int j = 0; j < x2.length; j++) {
                output[i+j] += x1[i] * x2[j];
            }
        }

        for (int i = 0; i < output.length-1 ; i++) {
            output[i+1] += output[i]/10;
            output[i] %= 10;
        }

        return output;
    }

    //this was from yesterday - recursion today
    static int findInsertLocation( double[] toSearch, double toInsert){
        //binary search
        //only works iwht a sorted collection
        //we start with a min at the beginning of the collection
        //and a max at the end
        //we look at the middle and see if it's too big or too small
        //then that middle is either the new min or the new max
        //we'll know we've found the location when the min and max touch

        int min =0;
        int max = toSearch.length -1;

        //when working with doubles = java has an issue with exact values
        //this is because the computer expresses nums in base2 whereas we express them in base10
        //bigdecimal type and not a double.

        while (min< max){
            int middle = (min+ max)/2;

            if(toInsert < toSearch[middle]){
                max = middle - 1;
            } else if (toInsert > toSearch[middle]){
                min = middle +1;
            } else {
                return middle;
            }
        }
        return min;
    }

    static int findInsertLocationRecursive( double[] toSearch, double toInsert, int min, int max){
        //when we have recursion
        //in order to avoid a stack overflow error
        //we have to have an exit condition.
        //these will generally be our "base case"

        if( min >= max ) return min;

        int middle = (min + max)/2;
        if(toInsert < toSearch[middle]) return findInsertLocationRecursive(toSearch, toInsert, min, middle-1 );
        else if(toInsert > toSearch[middle]) return findInsertLocationRecursive(toSearch, toInsert, middle+1, max );
        else return middle;
    }
}
