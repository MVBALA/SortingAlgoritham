import java.util.Arrays;

public class InsertionSortChallenge {
    public static void main(String[] args) {
        int[] a={20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(a));
//        for(int i=1;i<a.length;i++){
//
//            for (int j=i;j>0;j--){
//                if(a[j]<a[j-1]){
//                    int temp=a[j];
//                    a[j]=a[j-1];
//                    a[j-1]=temp;
//                }else {
//                    break;
//                }
//            }
//        }
        insertionSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void insertionSort(int[] a,int n){
        if(n<2) return;
        insertionSort(a,n-1);
        int newElement=a[n-1],i;
        for (i=n-1;i>0 &&a[i-1]>newElement;i--){
            a[i]=a[i-1];
        }
        a[i]=newElement;
        System.out.println("steps"+n);
        System.out.println(Arrays.toString(a));
        System.out.println("-------------------------------------");
    }
}
