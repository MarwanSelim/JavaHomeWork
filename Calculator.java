public class Calculator implements ICaculator {
    public int add (int x, int y){
        return x+y;
    }
    public float divide (int x, int y){
        float m = x;
        float n = y;
        try {
            if (n == 0) {
                System.out.println("erorr you have divided by zero");
                return 0;
            } else {
                return m / n;
            }
        }catch (ArithmeticException ae){
            System.out.println("you have commited an error");
            return 0;
        }
    }
}
