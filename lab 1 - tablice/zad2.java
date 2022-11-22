public class Main {
    int fib(int n){
        if ((n==0)||(n==1))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] tab = new int[Integer.parseInt(args[0])];
        for(int i = 0; i < tab.length; i++){
            tab[i] = obj.fib(i);
            System.out.println(tab[i]);
        }
    }
}