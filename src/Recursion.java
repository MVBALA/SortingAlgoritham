public class Recursion {
    public static void main(String[] args) {
        System.out.println(re(5));
    }
    public static int re(int n){
        if(n==0){
            return 1;
        }
        return n*re(n-1);

    }
}
