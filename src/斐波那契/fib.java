package 斐波那契;
public class fib {
    //递归算法下的斐波那契数
    public static int fib1(int n){
        if (n<=1&&n>=0){
            return n;
        }
        return fib1(n-1)+fib1(n-2);
    }
    //非递归算法下的斐波那契数
    public static int fib2(int n){
        if (n<=1&&n>=0){
            return n;
        }
        int first=0;
        int second=1;
        for(int i=0;i<n-1;i++){
            int sum=first+second;
            first=second;
            second=sum;
        }
        return second;
    }
    //利用线性代数的特征值解
    public static int fib3(int n){
        double c=Math.sqrt(5);
        return (int)((Math.pow((1+c)/2,n)-Math.pow((1-c)/2,n))/c);
    }
    public static void main(String args[]){
        int n=20;
        System.out.println(fib1(n));
        System.out.println(fib2(n));
        System.out.println(fib3(n));
    }
}

