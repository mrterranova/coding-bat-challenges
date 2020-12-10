public class Notes12920 {

    static int[] fieldArray;

    public static void main(String[] args) {
        //Arrays
        //declaring an array variable
        //type of each element, followed by empty [] and then the array name

        //int[]arr; //by default arr gets a null
        int[] arr;
        int sizeOfNewArray = 5;
        arr = new int[sizeOfNewArray]; //created an 'empty' array of size sizeOfNewArray

        for(int i=0; i < arr.length; i++) System.out.println(arr[i]);
        //default values of boolean array is false;
        //Integer[] defaults to null; this is because of reference types


        //initializing an array with data
        int[] arr1 =  {3, 4, 5, 6}; //both declaring an array variable and initializing it with data
        int[] arr2 = new int[]{1,2,3}; //will be initialized with only the num of elements necessary to hold the initial data

        System.out.println(arr.length); //prints 3

        System.out.println( arr1[2]);   //array is zero-index - 3rd element at index 2
                                        //prints 5

        //how do we typically interact with arrays?
        //usually a for loop
        //we use a for loop whenever we want to iterate some known number of times

        for (int i = 0; i < arr1.length; i++) {
            //create an index variable i, keep looping as long as we are still in the realm of valid indices
            //increase i (this position) by 1 each iteration
            int valueAtIndex = arr1[i]; //WARNING: DO NOT CONFUSE THE INDEX W/THE VALUE
        }

        //common algorithms with arrays
        //search
        //aggregate methods: many to one thing - sum, min, max, avg, stddev, firstElement, lastElement, median
        //sorting(ascending/descending) ie bubblesort, insertion sort, merge sort, heap sort, quick sort, selection sort, shell sort
        double[] toSort = { 2.3, 4.5, 3.2, 1.8};
        for (int i = 0; i < toSort.length ; i++) {
            for(int j=0; j < toSort.length; j++) {
                if (toSort[i] < toSort[j]){
                    double temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;

                }
            }
        }
        System.out.println("bubble sort");
        for (int i = 0; i < toSort.length; i++) {
            System.out.println(toSort[i]);
        }


        //bubble sorting with while loop
        boolean hadSwap = true;

        //we have a while loop bc we don't know how many times we need to loop
        while(hadSwap){
            //we're going to do a pass
            //we'll start 'hadSwap' as false
            hadSwap = false;
            for (int i = 0; i < toSort.length-1; i++) {
                //if the element at the current position is greater than the next element
                if(toSort[i] > toSort[i+1]){
                    double temp = toSort[i];
                    toSort[i] = toSort[i+1];
                    toSort[i+1] = temp;
                    hadSwap = true;
                }
            }
        }

        System.out.println("bubble sort");
        for (int i = 0; i < toSort.length; i++) {
            System.out.println(toSort[i]);
        }


    }

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
}
