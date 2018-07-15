public class ArrayTest {
    public static void main(String[] args) {

            int [][] tab1 = new int[2][2];
            int [][] tab2 = new int[2][2];
            ArrayComparator comparator = new ArrayComparator();
        System.out.println(comparator.compare(tab1,tab2));

    }
}
