package practice.basic;



import java.util.Arrays;    

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(arr));
    }
    
//  Write a program to find the second largest
//  element in an array of integers.
    static int secondLargest(int[] arr){
        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > fLargest) {
                sLargest = fLargest;
                fLargest = j;
            } else if (j > sLargest && j != fLargest) {
                sLargest = j;
            }
        }
        return sLargest;
    }




    // reverse(arr);
    //     System.out.println(Arrays.toString(arr));
    // reverse array wihtout using additional array 
    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}
