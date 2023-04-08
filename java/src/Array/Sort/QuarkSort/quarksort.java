package Array.Sort.QuarkSort;

public class quarksort {
    public static void main(String[] args) {
        int []arr={6,5,1,2,7,8,9,3,4};
        sort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void sort(int[]arr,int i,int j) {
        int start=i+1;
        int end=j;
        if(start>end)
            return;
        int basenum=arr[i];//确定基准数

        while(start!=end){
            //从后遍历，寻找比基准数小的数
           while(true){
               if(end<=start||arr[end]<basenum)
                   break;
               end--;
           }
           //从前遍历比基准数大的数
           while (true){
               if (start>=end||arr[start]>basenum)
                   break;
               start++;
           }
           //交换数值
            int tmp=arr[start];
           arr[start]=arr[end];
           arr[end]=tmp;

        }
        //基准数归位
        int tmp=arr[start];
        arr[start]=arr[i];
        arr[i]=tmp;

       // sort(arr,i,start-1);
       // sort(arr,start+1,j);
    }
}

