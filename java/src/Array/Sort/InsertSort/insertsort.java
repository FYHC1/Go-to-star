package Array.Sort.InsertSort;

import java.util.Arrays;

public class insertsort {
    public static void main(String[] args) {
        int []arr={2,5,33,23,6,44,38,45,55,60};
        int startindex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]) {
                startindex = i + 1;
                break;
            }
        }
        for (int i = startindex; i < arr.length; i++) {
            int j=i;
            while (j>0&&arr[j]<arr[j-1]){
                int tmp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
