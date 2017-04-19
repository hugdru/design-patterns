package behavioral.iterator.iterable;

import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        MyArrayCollection myArrayCollection = new MyArrayCollection(new String[]{"Hello", "this", "is", "a", "silly", "string", "to", "be"});
        for (String string : myArrayCollection) {
            System.out.println(string);
        }

        System.out.println();
        Iterator<String> iterator = myArrayCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n" + String.join(" ", myArrayCollection));
    }
}
