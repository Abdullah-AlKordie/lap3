import org.omg.CORBA.INTERNAL;

import java.util.Stack;
public class hw3 {
    static int postfix(String x) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char u = x.charAt(i);
            if (Character.isDigit(u))
                stack.push(u - '0');
            else {
                int operand1=stack.pop();
                int operand2=stack.pop();
                switch (u) {
                    case '+':stack.push(operand2+operand1);
                        break;
                    case '-':stack.push(operand2-operand1);
                        break;
                    case '*':stack.push(operand2*operand1);
                        break;
                    case '/':stack.push(operand2/operand1);
                        break;
                    case '^':stack.push((int)Math.pow(operand2,operand1));
                        break;
                }
                }
            }
        return stack.pop();
    }

    public static void main(String[] args) {

    }
}