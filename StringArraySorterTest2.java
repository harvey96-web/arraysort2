import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StringArraySorterTest {
    @Test
    public void testSort() {
        StringArraySorter sorter = new StringArraySorter();
        String[] unsorted = {"banana", "apple", "cherry", "date"};
        String[] expected = {"apple", "banana", "cherry", "date"};
        assertArrayEquals(expected, sorter.sort(unsorted));
    }
}
