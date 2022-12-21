import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args){
        int[] radixArray={4725,538,4586,1330,8792,1594,5729};
//radixSor(radixArray);
        radixSort(radixArray,10,4);

        System.out.println(Arrays.toString(radixArray));
    }
    public static void radixSort(int[] a,int radix,int width){
        for (int i=0;i<width;i++){
            radixSingleSort(a,i,radix);
        }

    }

    private static void radixSingleSort(int[] a, int position, int radix) {
        int n=a.length;
        int[] countArray=new int[radix];
        for (int v:a){
            countArray[getDigit(position,v,radix)]++;
        }
        for (int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }
        int[] temp=new int[n];
        for (int i=n-1;i>-1;i--){
            temp[--countArray[getDigit(position,a[i],radix)]]=a[i];
        }
        for (int i=0;i<a.length;i++){
            a[i]=temp[i];
        }
    }

    private static int getDigit(int position, int v, int radix) {
        return v/(int) Math.pow(10,position)%radix;

    }



    //Another Method
   /* public static void radixSor(int[] a){
        int n=a.length;
        int max=getMax(a);
        for (int p=1;max/p>0;p*=10){
            countSort(a,n,p);
        }
    }

    private static void countSort(int[] a, int n, int p) {
        int[] c=new int[10];
        for (int i:a){
            c[((i/p)%10)]++;
        }
        for (int i=1;i<c.length;i++){
            c[i]+=c[i-1];
        }
        int[] b=new int[n];
        for (int i=n-1;i>-1;i--){
            b[--c[((a[i]/p)%10)]]=a[i];
        }
        for (int i=0;i<a.length;i++){
            a[i]=b[i];
        }



    }

    private static int getMax(int[] a) {
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }*/


}
