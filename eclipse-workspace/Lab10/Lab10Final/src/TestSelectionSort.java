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
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arr);
    }
}
