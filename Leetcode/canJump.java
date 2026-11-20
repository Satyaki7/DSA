public class canJump {
    public boolean canOP(int[] nums) {
        int g = nums.length - 1;
        for (int i = nums.length - 2; i > -1; i--) {
            if (i + nums[i] >= g) {
                g = i;
            }
        }
        if (g == 0) {
            return true;
        }else
            return false;
        
    }

    public static void main(String[] args) {
        canJump t = new canJump();
        int[] l = { 2, 3, 1, 1, 4};
        System.out.println(t.canOP(l));
    }
}
