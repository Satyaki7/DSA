public class Rotate {
    public void rotate(int[] nums, int k) {
//         int l = nums.length;
//         if(l == 1)
//             return;
//         if(k>l)
//             k = k % l;
//         int l1 = l - k,temp;
//         for(int i = 0;i<l1/2;i++){
//             temp = nums[i];
//             nums[i] = nums[l1-1-i];
//             nums[l1-1-i] = temp;
//         }
//         for (int i = 0; i < (l - l1) / 2; i++) {
//             temp = nums[l1 + i];
//             nums[l1 + i] = nums[l - 1 - i];
//             nums[l - 1 - i] = temp;
//         }
//         for(int i = 0;i<l/2;i++){
//             temp = nums[i];
//             nums[i] = nums[l-1-i];
//             nums[l-1-i] = temp;
//         }
//         for(int i = 0;i<l;i++){
//             System.out.println(nums[i]);
//         }

        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    //with recursion 
    public void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] =temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1};
        int m = 7; 
        // int[] nums2 = {3,6,7,8}; 
        // int n = 4;
        Rotate obj = new Rotate();
        obj.rotate( nums1, m);
    }

}
