import java.util.Iterator;

public class RangeIterator implements Iterator<Integer>{
    private int max;
    private int nextInt;
    public RangeIterator(int max , int min){
        if (min > max) { System.out.println("min must be <= max") ; }
        this.nextInt=min;
        this.max=max;
    }
    @Override
    public boolean hasNext() {
        return nextInt <= max;
    }
    @Override
    public Integer next() {
        if (!hasNext()) {
            return null;
        }
        return Integer.valueOf(nextInt++);
    }
}