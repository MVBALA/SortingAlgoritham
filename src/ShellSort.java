public class ShellSort {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for(int gap=a.length/2;gap>0;gap/=2){
            for (int i=gap;i<a.length;i++){
                int j=i;
                while ((j>=gap)&&(a[j-gap]>a[j])){

                        int t=a[j-gap];
                        a[j-gap]=a[j];
                        a[j]=t;
                        j-=gap;
                    }

                for (int k:a){
                    System.out.print(k+" ");
                }
                System.out.println();


            }
        }


//        for(int gap=a.length/2;gap>0;gap/=2){
//            for (int i=gap;i<a.length;i++){
//                int j=i-gap;
//                while ((j>=0)&&(a[j+gap]<a[j])){
//
//                    int t=a[j+gap];
//                    a[j+gap]=a[j];
//                    a[j]=t;
//                    j-=gap;
//                }
//
//                for (int k:a){
//                    System.out.print(k+" ");
//                }
//                System.out.println();
//
//
//            }
//        }

//          Another method ;
//        for(int gap=a.length/2;gap>0;gap/=2){
//            for (int i=gap;i<a.length;i++){
//                int temp=a[i];
//                int j=i-gap;
//                while (j>=0  && a[j]>temp){
//                    a[j+gap]=a[j];
//                    j-=gap;
//                }
//                a[j+gap]=temp;
//                for (int k:a){
//                    System.out.print(k+" ");
//                }
//                System.out.println();
//
//
//            }
//    }
        for (int i:a){
            System.out.println(i);
        }
}}
