import java.util.Arrays;

public class RadixSortChallenge {
    public static void main(String[] args) {
        String[] a={"bcdef","dbaqc","omadd","abcde","bbbbb","ccccc"};
        System.out.println(Arrays.toString(a));
        radixSort(a,26,5);
        
        System.out.println(Arrays.toString(a));
    }
    public static void radixSort(String[] a,int radix,int width){
        for (int i=width-1;i>=0;i--){
            radixSingleSort(a,i,radix);
        }

    }

    private static void radixSingleSort(String[] a, int position, int radix) {
        int n=a.length;
        int[] countArray=new int[radix];
        for (String v:a){
            countArray[getIndex(position,v)]++;
        }
        for (int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }
        String[] temp=new String[n];
        for (int i=n-1;i>-1;i--){
            temp[--countArray[getIndex(position,a[i])]]=a[i];
        }
        for (int i=0;i<a.length;i++){
            a[i]=temp[i];
        }
    } 
    private static int getIndex(int position, String v) {
        return v.charAt(position)-'a';

    }
}
