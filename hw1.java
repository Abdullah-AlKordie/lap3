import java.util.Stack;

public class hw1 {
    public static void main(String[] args) {
        Stack<Object> X=new Stack<>();
        Stack<Object> H=new Stack<>();
        X.push("A");
        X.push("B");
        X.push("D");
        X.push("U");
        X.push("L");
        X.push("L");
        X.push("A");
        X.push("H");
        System.out.println("Stack nom1 =     "+X);
        System.out.println("Stack size =     "+X.size());
        int s=X.size();
        for (int i = 0; i < s; i++) {
            H.push(X.pop());
        }
        System.out.println("Stack nom2 =     "+H);
    }
}
