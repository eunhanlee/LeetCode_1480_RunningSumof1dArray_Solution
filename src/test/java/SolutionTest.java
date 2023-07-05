import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testRunningSum() {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        int[] expected1 = {1, 3, 6};
        int[] actual1 = solution.runningSum(nums1);
        assertArrayEquals(expected1, actual1);

        // Test Case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] expected2 = {1, 2, 3, 4, 5};
        int[] actual2 = solution.runningSum(nums2);
        assertArrayEquals(expected2, actual2);

        // Test Case 3
        int[] nums3 = {3, 1, 2, 10, 1};
        int[] expected3 = {3, 4, 6, 16, 17};
        int[] actual3 = solution.runningSum(nums3);
        assertArrayEquals(expected3, actual3);

        // Test Case 4
        int[] nums4 = {-1, -2, -3, -4, -5};
        int[] expected4 = {-1, -3, -6, -10, -15};
        int[] actual4 = solution.runningSum(nums4);
        assertArrayEquals(expected4, actual4);

        // Test Case 5
        int[] nums5 = {0, 0, 0, 0, 0};
        int[] expected5 = {0, 0, 0, 0, 0};
        int[] actual5 = solution.runningSum(nums5);
        assertArrayEquals(expected5, actual5);

        // Test Case 6
        int[] nums6 = {9};
        int[] expected6 = {9};
        int[] actual6 = solution.runningSum(nums6);
        assertArrayEquals(expected6, actual6);

        // Test Case 7
        int[] nums7 = {};
        int[] expected7 = {};
        int[] actual7 = solution.runningSum(nums7);
        assertArrayEquals(expected7, actual7);

        // Test Case 8
        int[] nums8 = {-10, 5, 3, -2, 8};
        int[] expected8 = {-10, -5, -2, -4, 4};
        int[] actual8 = solution.runningSum(nums8);
        assertArrayEquals(expected8, actual8);

        // Test Case 9
        int[] nums9 = {7, 7, 7, 7, 7, 7, 7};
        int[] expected9 = {7, 14, 21, 28, 35, 42, 49};
        int[] actual9 = solution.runningSum(nums9);
        assertArrayEquals(expected9, actual9);

        // Test Case 10
        int[] nums10 = {1, -1, 1, -1, 1, -1};
        int[] expected10 = {1, 0, 1, 0, 1, 0};
        int[] actual10 = solution.runningSum(nums10);
        assertArrayEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
