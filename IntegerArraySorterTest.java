import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IntegerArraySorterTest {
    @Test
    public void testSort() {
        IntegerArraySorter sorter = new IntegerArraySorter();
        int[] unsorted = {5, 3, 8, 1};
        int[] expected = {1, 3, 5, 8};
        assertArrayEquals(expected, sorter.sort(unsorted));
    }
}
