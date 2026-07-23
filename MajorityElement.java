class MajorityElement{
    
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int count =1;
        int me = nums[0];
        for(int i = 0;i<l;i++){
            if(me != nums[i]){
                count = count - 1;
                if(count == 0){
                    count++;
                    me = nums[i];
                }
            }else{
                count++;
            }
        }
        return me;
    }
    
    public static void main(String[] args) {
        // int nums1[] = {2,2,1,1,1,2,2};
        int nums1[] = {8,8,7,7,7};
        // int nums1[] = {1,2,3,4,5};
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(nums1));
    }
}