public class Morning121020 {
    public static void main(String[] args) {
        int[] arr = {9,7,2,9,7,7,8,6,9,5,8,8,7,7,2,6,4,3,5,7,1,2,8,5,9,7,3,0,0,5,8,9,4,4,7,3,6,7,6,3,0,8,2,1,1,9,5,9,7,8,4,7,6,5,3,6,0,9,9,4,1,0,5,8,2,4,7,3,3,6,0,8,3,4,6,6,4,3,6,9,5,0,1,6,0,9,0,5,9,0,4,8,3,5,7,1,5,1,7,5};
        int[] arr1 = {6,5,3,8,7,4,8,8,0,8,9,3,2,1,3,8,0,9,1,8,2,8,9,4,2,1,5,0,9,2,6,5,7,1,9,7,7,3,2,8,4,9,9,6,5,8,2,7,0,2,3,7,1,5,8,9,2,5,6,8,7,6,1,6,7,9,1,2,5,1,5,0,7,7,8,3,6,4,1,4,7,5,2,9,4,5,2,8,9,1,1,2,4,6,5,5,2,8,7,2};
        int[] arr2 = {9,9,9};
        int[] arr3 = {9,9,9};
//        int[] arr4 = {};
//        int[] arr5 = {};
        //test cases
        int[] res = add(arr, arr1);
        int[] res2 = multiply(arr2, arr3);
        for (int i = res2.length-1; i >= 0; i--) {
            System.out.print(res2[i]);
        }

//        System.out.println(add(arr2, arr3));
//        System.out.println(add(arr4, arr5));
    }

    static int[] add( int[] arr1, int[] arr2) {
        //take in two int arrays
        //arr 100 digits long and output sum of the two 100 digit nums.
        int[] sum = new int[arr1.length+1];
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = (arr1[i]+arr2[i]+temp)%10 ;
            temp = (arr1[i]+arr2[i]+temp)/10;
            if(i == arr1.length-1){
                sum[i+1] = temp;
            }
        }
        return sum;
    }

    static int[] multiply(int[] arr1, int[] arr2){
        int[] product = new int[arr1.length+arr2.length];
        int[][] partials = new int[100][100];
        int carry = 0;
        int temp = 0;
        int count = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                partials[i][j] = arr1[i] * arr2[j];
                temp = partials[i][j];

                System.out.println("temp: " + temp + " carry: "+ carry + " index: "+ i);
            }

            product[i] += ((temp+carry)%10)*count;
            carry = (temp+carry)/10;
            if(i == arr1.length-1){
                product[i+1]=carry;
            }
            count *= 10;
        }
        return product;
    }
}
