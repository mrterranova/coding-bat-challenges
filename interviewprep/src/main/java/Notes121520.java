import java.util.Random;

public class Notes121520 {
    public static void main(String[] args) {

    }

    private static void quickSort(double[] arr, int min, int max){
        //pivot value - some value that is somewhere in the array
        //like to pick a value that is a median of the incoming data
        //want to get all the nums smaller to the left of pivot &&
        //all the nums greater to the right of the pivot
        //recursively call quicksort on each side of the pivot.
        //main index and a max index passed in.

        //[ v   p    ]
        //[     p   v]

        //[    p    v]
        //[    pv    ]
        //[    vp    ]

        //[v    p    ]
        //[     vp   ]
        //[     pv   ]

        //if equal great than

        int pivotIndex = selectPivot(arr, min, max);
        double pivotValue = arr[pivotIndex];

        for(int i = min; i <= max; i++){
            if(i == pivotIndex) continue;
            if(pivotValue < arr[i] && i < pivotIndex){
                // swap arr[i] to the pivotIndex-1
                swap(arr, i, pivotIndex-1 );
                // swap arr[pivotIndex - 1] with arr[pivotIndex]
                swap(arr, pivotIndex-1, pivotIndex);
                // i-- //need to stay the same
                i--;
                //pivotIndex - 1
                pivotIndex--;
            }
            if(arr[i] < pivotValue && i > pivotIndex){
                // swap arr[i] to pivotIndex+1
                swap(arr, i, pivotIndex+1);
                // swap arr[pivotIndex+1] with arr[pivotIndex]
                swap(arr, pivotIndex+1, pivotIndex);
                // pivotIndex + 1
                pivotIndex++;
            }
        }
        quickSort(arr, min, pivotIndex-1);//left
        quickSort(arr, pivotIndex+1, max);//right
    }
    private static int selectPivot(double[] arr, int start, int end){
        Random ran = new Random();
        return (start+end)/2;
    }
    private static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
