public class canJump2 {
    public int canOP(int[] nums) {
        
        int i = 0, h = 0, f = 0, m = 0,mv = 0;
        while (i < nums.length) {
            f = nums[i];
            
            i = m - mv;
            h++;
        }
        return h;
      
    }

    public static void main(String[] args) {
        canJump2 t = new canJump2();
        int[] l = { 2, 3, 0, 1, 4};
        System.out.println(t.canOP(l));
    }
}
