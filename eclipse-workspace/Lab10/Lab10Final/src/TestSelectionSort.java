import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestSelectionSort {

    @Test
    public void testPositives() {
        int[] arr = {10, 7, 3, 8, 1}; // Change positive values
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[]{1, 3, 7, 8, 10}, arr);
    }

    @Test
    public void testNegatives() {
        int[] arr = {-3, -8, -1, -5, -2}; // Change negative values
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[]{-8, -5, -3, -2, -1}, arr);
    }

    @Test
    public void testMixed() {
        int[] arr = { 5, -2, 0, 1, -5 };
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[] { -5, -2, 0, 1, 5 }, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = { 5, 2, 5, 1, 2 };
        SelectionSort.basicSelectionSort(arr);
        assertArrayEquals(new int[] { 1, 2, 2, 5, 5 }, arr);
    }
}
