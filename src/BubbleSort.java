public class BubbleSort {
    public static void main(String[] args) {
        int[] a={20,35,-15,7,55,1,-22};
        int c=0;
        for (int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }

//        Another method for bubble sort

//        for(int i=1;i<a.length;i++){
//            for (int j=0;j<a.length-i;j++){
//                if(a[j]>a[j+1]){
//                   swap(a,j,j+1);
//                  c++;
//                }
//            }
//            if(c==0){
//                break;
//            }
//        }
        for (int i:a){
            System.out.println(i);
        }
    }
    public static void swap(int[] a,int i,int j){
        if(i==j){
            return ;
        }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

    }
}