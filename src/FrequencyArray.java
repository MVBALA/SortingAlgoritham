public class FrequencyArray {
    public static void main(String[] args){
        int[] a={2,1,3,2,2,5,8,9,8};
        int[] fre=new int[10];
       for(int i=0;i<a.length;i++){
            if(fre[a[i]]++>0){
                a[i]=0;
            }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]>0){
                System.out.println(a[i]+"-"+fre[a[i]]);
            }
        }

    }
}
