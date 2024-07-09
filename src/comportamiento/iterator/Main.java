package comportamiento.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hola", "como", "estas");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //Pila
            Stack<String> stack = new Stack<>();
            stack.push("hola");
            stack.push("como");
            stack.push("estas");
            iterator = stack.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

}
