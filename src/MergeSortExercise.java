import java.util.Arrays;

public class MergeSortExercise {
    public static void main(String[] args) {
        int[] a={20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(a));
        mergedSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void mergedSort(int[] a, int s,int e){
        if(e-s<2) return;
        int mid=(s+e)/2;
        mergedSort(a,s,mid);
        mergedSort(a,mid,e);
        MergeInplace(a,s,mid,e);
       // System.out.println(Arrays.toString(a));
    }

    private static void MergeInplace(int[] a, int s, int mid, int e) {
        if(a[mid-1]>=a[mid])
            return;
         int i=s,j=mid,z=0;
         int[] n=new int[e-s];
         while(i<mid && j<e){
             n[z++]=a[i]>=a[j]?a[i++]:a[j++];
         }
         while (i<mid){
             n[z++]=a[i++];
         }
        while (j<e){
            n[z++]=a[j++];
        }
        for (int c=0;c<n.length;c++){
            a[s+c]=n[c];
        }
    }

}
