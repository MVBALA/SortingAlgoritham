import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a={20,35,-15,7,55,1,-22};
        mergeSortInPlace(a,0,a.length);
        for (int i:a){
            System.out.println(i);
        }
    }
    public static int[] mergeSort(int[] a) {
if(a.length==1) return a;
        int m=a.length/2;
      int[] l=mergeSort(Arrays.copyOfRange(a,0,m));
        int[] r= mergeSort(Arrays.copyOfRange(a,m,a.length));

       return merge(l,r);
    }
    public static int[] merge(int a[],int b[]){
        int i=0,j=0,k=0;
        int[] n=new int[a.length+b.length];
        while (i<a.length &&j< b.length) {
            if(a[i]>b[j]){
                n[k++]=b[j++];
            }
            else if(a[i]<b[j]){
                n[k++]=a[i++];
            }else if(a[i]==b[j]){
                n[k++]=a[i++];
                j++;
            }

        }
        while (i<a.length){
            n[k++]=a[i++];
        }
        while (j<b.length){
            n[k++]=b[j++];
        }


        return  n;

    }
    public static void mergeSortInPlace(int[] a,int s,int e) {
        if(e-s==1) return ;
        int m=s+e/2;
        mergeSortInPlace(a,s,m);
        mergeSortInPlace(a,m,e);
     mergeInPlace(a,s,m,e);
    }
    public static void mergeInPlace(int a[],int s,int m,int e){
        int i=s,j=m,k=0;
        int[] n=new int[s+e];
        while (i<s &&j< s) {
            if(a[i]>a[j]){
                n[k++]=a[j++];
            }
            else if(a[i]<a[j]){
                n[k++]=a[i++];
            }else if(a[i]==a[j]){
                n[k++]=a[i++];
                j++;
            }

        }
        while (i<s){
            n[k++]=a[i++];
        }
        while (j<e){
            n[k++]=a[j++];
        }

        for (int z=0;z<n.length;z++){
            a[s+z]=n[z];
        }


    }
}
