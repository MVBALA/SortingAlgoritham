public class InsertionSort {
    public static void main(String[] args) {
        int[] a={20,35,-15,7,55,1,-22};

        for(int i=1;i<a.length;i++){

            for (int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else {
                    break;
                }
            }
        }
//          Another method
//        for(int i=1;i<a.length;i++){
//
//            for (int j=i;j>0 &&(a[j]<a[j-1]);j--){
//
//                int temp=a[j];
//                a[j]=a[j-1];
//                a[j-1]=temp;
//
//            }
//        }
        for (int i:a){
            System.out.println(i);
        }


    }
}
