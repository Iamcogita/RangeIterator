public class Main2 {
    public static void main(String[] args) {

        RangeIterator2 rangeIter = new RangeIterator2(-2, 44);

        for (Integer num : rangeIter) {
            System.out.println(num);
        }
    }
}