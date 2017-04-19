package behavioral.iterator.myIterable;

class Main {
    public static void main(String[] args) {
        MyArrayCollection myArrayCollection = new MyArrayCollection(new String[]{"Hello", "this", "is", "a", "silly", "string", "to", "be"});

        MyIterator<String> iterator = myArrayCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
