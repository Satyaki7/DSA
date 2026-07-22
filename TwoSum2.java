
import java.util.Arrays;

class Problem2 {
    public int merge(int[] nums1, int m) {
        nums1 = Arrays.stream(nums1)
                .filter(n -> n != m)
                .toArray();

        return nums1.length;
        
    }

    public static void main(String[] args) {
        int nums1[] = {1,4,3,4,35,35,6,4};
        int m = 4; 
        Problem2 obj = new Problem2();
        int l = obj.merge(nums1, m);
        System.out.println(l);
    }
}