import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Stack;

import static javafx.scene.input.KeyCode.S;

public class hw2 {
    static  int counter=0;
    static Stack<Object> stack=new Stack<>();
    public static String pop (){
        while (!stack.isEmpty()){
            System.out.println("Removed = "+ stack.pop());
            System.out.println("stack size is = "+stack.size());
            System.out.println("Are hte stack Empty     "+stack.isEmpty());
        }
        return "No stack is Empty\nstack="+stack;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        stack.push("A");
        stack.push("B");
        stack.push("D");
        stack.push("U");
        stack.push("L");
        stack.push("L");
        stack.push("A");
        stack.push("H");
        System.out.println("Element pushed to stack ");
        System.out.println("stack size before doing any thing   "+stack.size());
        System.out.println("This is the Elements in the stack"+"\t"+stack);
        System.out.println(pop());
        for (int i = 0; i < stack.capacity() ; i++) {
            System.out.println("Enter the value that you want ; ) ");
            stack.push("a ");
            System.out.println(stack);
            System.out.println(stack.capacity());
        }
        pop();
    }
}
