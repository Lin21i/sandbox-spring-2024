package algorithm;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fn = new FibonacciNumbers();
        for (int x =0; x <=15; x++){
            System.out.println("fib("+ x + ")= " +fn.fib(x));
        }
    }


    private long fib(int x){
        if(x == 0){
            return 0;
        }
        if (x == 1){
            return 1;
        }
        return fib(x -1)+fib (x -2);

    }
}
