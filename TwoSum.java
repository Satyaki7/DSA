class Problem1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr = new int[m+n];
        int i = 0,a = 0,b = 0;
        while(i < m+n){
            if (b >= n || (a < m && nums1[a] <= nums2[b])) {
                arr[i] = nums1[a];
                a++;
            } 
            
            else {
                arr[i] = nums2[b];
                b++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4};
        int m = 4; 
        int[] nums2 = {3,6,7,8}; 
        int n = 4;
        Problem1 obj = new Problem1();
        obj.merge( nums1, m, nums2, n);
    }
}