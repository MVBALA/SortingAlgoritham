import java.util.Arrays;

public class QuickSort {
    public static   int[] a={20,35,-15,7,55,1,-22};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
        quickSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
        
    }
    public static void quickSort(int[] a,int s,int e){
        if(e-s<2) return;

        int piviotIndex=partition(a,s,e);
        quickSort(a,s,piviotIndex);
        quickSort(a,piviotIndex+1,e);

    }

    private static int partition(int[] a, int s, int e) {
        int pivot=a[s];
        int i=s;
        int j=e;
        while (i<j){
            while (i<j && a[--j]>=pivot);
            if(i<j){
                a[i]=a[j];
            }
            while (i<j && a[++i]<=pivot);
            if(i<j){
                a[j]=a[i];
            }
        }
        a[j]=pivot;// use i also
        return j;




    }
}
