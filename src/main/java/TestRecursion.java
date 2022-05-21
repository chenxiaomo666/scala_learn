import java.time.Year;

public class TestRecursion {
    public static void main(String[] args){
        // 计算阶乘
        System.out.println(factorial(4));
        System.out.println(factorial1(5));
    }

    // 1、循环实现
    public static int factorial(int n){
        int result = 1;
        for(int i=n; i>1; i--){
            result *= i;
        }
        return result;
    }

    // 2、递归实现
    public static int factorial1(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n*factorial1(n-1);
        }
    }
}
