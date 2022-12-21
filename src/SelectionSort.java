public class SelectionSort {
    public static   void main(String[] args){
        int[] a={20,35,-15,7,55,1,-22};

        for (int i=0;i<a.length-1;i++){
            boolean swap=false;
            for (int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){
                    swap(a,i,j);
                    swap=true;
                }
            }
            if(!swap){
                break;
            }

        }



//          Another method for selected sort
//        for (int i=0;i<a.length-1;i++){
//            int x=a[i],z=i;
//            for (int j=i+1;j<a.length;j++){
//                if(a[j]<x){
//                    x=a[j];
//                    z=j;
//
//
//            }
//
//            }
//            swap(a,i,z);
//        }
//  --------------------Another Method----------------------------------
//        for (int i=a.length-1;i>0;i--){
//            int large=0;
//            for (int j=1;j<=i;j++){
//                if(a[j]>a[large]){
//                    large=j;
//                }
//            }
//            swap(a,large,i);
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
