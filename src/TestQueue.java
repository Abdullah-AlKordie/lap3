import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
    firstQueue<Character> queue=new firstQueue<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("First = " +queue.first());
        System.out.println("Queue Size is = "+queue.size());
    }
}
