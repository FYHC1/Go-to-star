package Exception;

public class Test3 {
    public static void main(String[] args) {
        int arr[]={};
       int max= getMax(arr);
    }
    public static int getMax(int[] arr){
        if (arr.length==0){
            throw new RuntimeException();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
