public class Main {
    public static void main(String[] args) {

         RangeIterator rangeIterator = new RangeIterator(23, 12);

        // print all the integer numbers between 23 and 12 (inclusive)

        for (RangeIterator it = rangeIterator; it.hasNext(); ) {
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
