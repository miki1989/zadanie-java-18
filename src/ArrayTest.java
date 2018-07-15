public class ArrayTest {
    public static void main(String[] args) {

            int [][] tab1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            int [][] tab2 = {{1,2,3,4},{5,6,7,9},{9,10,11,12}};
            ArrayComparator comparator = new ArrayComparator();
        System.out.println(comparator.compare(tab1,tab2));

    }
}
