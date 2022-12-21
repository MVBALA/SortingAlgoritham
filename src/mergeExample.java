import java.util.Arrays;

public class mergeExample {
    public static void main(String[] args) {
//        int a[]={-22,98,56,74,4,56,90,-100,534,132};
        int[] an={20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(an));
        merge(an,0, an.length);


        System.out.println(Arrays.toString(an));
    }
    public static void merge(int a[],int start, int end){
        if(end-start==1)
            return;
        int mid=(end+start)/2;
        merge(a,start,mid);
        merge(a,mid,end);
        mergeInPlace(a,start,mid,end);

    }
    public static void mergeInPlace(int a[],int start,int mid,int end){
     int i=start,j=mid,k=0;
     if (a[mid-1]>=a[mid])
         return;
     int[] n=new int[end-start];
     while (i<mid&&j<end){
//     if(a[i]>a[j]){
//         n[k++]=a[j++];
//     }else if(a[i]<a[j]){
//         n[k++]=a[i++];
//     }else {
//         n[k++]=a[i++];
//         j++;
//     }

         n[k++]=a[i]>=a[j]?a[i++]:a[j++];
     }
//     while (i<mid){
//         n[k++]=a[i++];
//     }
//     while (j<end){
//         n[k++]=a[j++];
//     }
//     for (int z=0;z<n.length;z++){
//         a[start+z]=n[z];
//     }
        System.arraycopy(n,0,a,start,k);

    }
}
