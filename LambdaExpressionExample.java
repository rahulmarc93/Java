package lambdaExpression;

interface LambdaExpressionExample {
	int add(int a, int b);
}

public class Addable {
    public static void main(String[] args) {
    	Addable add = (a, b) -> a + b;

        int result = add.add(10, 20);
        System.out.println("Sum: " + result); 
    }
}