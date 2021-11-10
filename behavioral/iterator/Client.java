package behavioral.iterator;

public class Client {

    public static void main(String[] args) {

        Collection collection = new Collection();

        Iterator<String> iterator = collection.getIterator();

        while (!iterator.hasNext()) {
            String item = iterator.next();

            System.out.println("Items on the item list: " + item);

        }

    }

}
