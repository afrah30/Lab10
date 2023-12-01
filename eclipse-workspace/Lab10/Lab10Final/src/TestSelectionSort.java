import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class TestSelectionSort {

    @Test
    public void testPositives() {
        int[] arr = { 5, 2, 9, 1, 5 };
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[] { 1, 2, 5, 5, 9 }, arr);
    }

    @Test
    public void testNegatives() {
        int[] arr = { -5, -2, -9, -1, -5 };
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[] { -9, -5, -5, -2, -1 }, arr);
    }
}
