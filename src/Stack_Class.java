/*                                                       STACK CLASS

-->The Stack class implements a last-in-first-out (LIFO) stack of elements.

-->You can think of a stack literally as a vertical stack of
 objects; when you add a new element, it gets stacked on top of the others.

-->When you pull an element off the stack, it comes off the top.
In other words, the last element you added to the stack is the first one to come back off.
 */

/*
-->Stack is a subclass of Vector that implements a standard last-in, first-out stack.

-->Stack only defines the default constructor, which creates an empty stack.
Stack includes all the methods defined by Vector, and adds several of its own
*/
import java.util.*;
public class Stack_Class {

    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        System.out.println("does stack is empty or not:"+st.empty());
        showpush(st, 99);
        System.out.println("peek element of a stack :"+st.peek());
        System.out.println("searching whether 99 is there or not:"+st.search(99)); //returns 1 bcz its offset from top is 1 rgt
        System.out.println("searching whether 66 is there or not:"+st.search(66));
        System.out.println("searching whether 42is there or not:"+st.search(42));
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
