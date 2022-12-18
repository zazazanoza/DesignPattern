package iterator;

public class NekoName implements Aggregate{
    private Neko[] nekos;
    private int last = 0;
    public NekoName(int maxsize) {
        this.nekos = new Neko[maxsize];
    }
    
    public Neko getNekoAt(int index) {
        return nekos[index];
    }
    
    public void appendNeko(Neko neko) {
        this.nekos[last] = neko;
        last++;
    }
    
    public int getLength() {
        return last;
    }
    
    public Iterator iterator() {
        return new NekoNameIterator(this);
    }
}
