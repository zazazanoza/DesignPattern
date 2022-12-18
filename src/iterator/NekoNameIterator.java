package iterator;

public class NekoNameIterator implements Iterator {
    private NekoName nekoName;
    private int index;
    public NekoNameIterator(NekoName nekoName) {
        this.nekoName = nekoName;
        this.index = 0;
    }
    public boolean hasNext() {
        if (index < nekoName.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    public Object next() {
        Neko neko = nekoName.getNekoAt(index);
        index++;
        return neko;
    }
}
