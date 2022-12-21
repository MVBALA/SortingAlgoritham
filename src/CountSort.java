import java.util.Arrays;

public class CountSort {
    public static   int[] a={8,7,9,4,5,6,1,3,4,5,9,10,9,8,3,6};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
        countInteger(a,0, 10);
        System.out.println(Arrays.toString(a));

    }
    public static void countInteger(int[] a,int min,int max){
        int[] count=new int[max-min+1];
        for(int i=0;i<a.length;i++){
            count[a[i]-min]++;
        }
        // Another method for stable sort
        for (int i=min+1;i<=max;i++){
            count[i]+=count[i-1];
        }
        int[] b=new int[a.length];
        for (int i=a.length-1;i>-1;i--) {
            b[--count[a[i]]]=a[i];

        }
        for (int i=0;i<a.length;i++){
            a[i]=b[i];
        }

//      Non Stable sort
//       int j=0;
//        for(int i=min;i<=max;i++){
//        while (count[i-min]>0){
//            a[j++]=i;
//        count[i-min]--;
//        }

//        }




















//        int[] countArray=new int[max-min+1];
//        for (int i=0;i<a.length;i++){
//            countArray[a[i]-min]++;
//        }
//        int j=0;
//       for (int i=min;i<=max;i++){
//           while (countArray[i-min]>0){
//               a[j++]=i;
//               countArray[i-min]--;
//           }
//
//
//       }
    }
}
