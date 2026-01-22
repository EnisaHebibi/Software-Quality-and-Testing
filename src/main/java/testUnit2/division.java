package testUnit2;

public class division {
    public int divide(int a,int b){
        if (b==0){
            throw new ArithmeticException("Division with zero");
        }
        return a/b;
    }
}
