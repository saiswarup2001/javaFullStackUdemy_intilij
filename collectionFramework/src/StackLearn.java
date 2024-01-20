import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        System.out.println("---------------push()----------------");
        animal.push("lion");
        animal.push("Tiger");
        animal.push("Cat");
        animal.push("Rat");
        System.out.println("Stack ele: "+ animal);
        System.out.println();
        System.out.println("---------------peek()----------------");
        System.out.println("peek : "+animal.peek()); // peek is used to see the top element present in the stack
        System.out.println();
        System.out.println("---------------pop()----------------");
        System.out.println("pop : "+ animal.pop());
        System.out.println("peek : "+ animal.peek());
    }
}
