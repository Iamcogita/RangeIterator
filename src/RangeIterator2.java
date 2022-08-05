import java.util.Iterator;

public class RangeIterator2 implements Iterable<Integer> {
    private int end;
    private int start;

    public RangeIterator2(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Iterator<Integer> iterator() {
        if (start > end) {
            return new DescendIterator();
        }
        return new AscendIterator();
    }

    private class DescendIterator implements Iterator<Integer> {
        private int nextInt = start + 1;

        @Override
        public boolean hasNext() {
            return nextInt > end;
        }

        @Override
        public Integer next() {
            nextInt--;
            return nextInt;
        }
    }

    private class AscendIterator implements Iterator<Integer> {
        private int nexInt = start - 1;

        @Override
        public boolean hasNext() {
            return nexInt < end;
        }

        @Override
        public Integer next() {
            nexInt++;
            return nexInt;
        }
    }
}