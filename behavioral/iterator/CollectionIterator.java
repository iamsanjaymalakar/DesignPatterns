package behavioral.iterator;

public class CollectionIterator implements Iterator<String> {

    private Collection collection;

    private int cursor = 0;

    public CollectionIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            String item = collection.getItems()[cursor];
            cursor++;
            return item;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return cursor == collection.getItems().length;
    }
}
