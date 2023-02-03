//Program to print fibonacci number..//
import java.util.*;
public class rec3 {
    static int fib(int n){
        int a =0;
        int b=1;
        if(n==0 || n==1){
            return n;
        }
        int prev = fib(n-1);
        int prevprev = fib(n-2);

        return prev+prevprev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n)); 
    }
}
