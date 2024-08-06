class jump{
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int l=0;
        int r=0;
        int min=0;
        int max=0;

        int jumpsNeeded = 0;

        for (int i = 0; i <nums.length; i++) {

            if(i==0){
                l=i+1;
                r=i+nums[i];
                jumpsNeeded++;
            }
            else if(i==r){
                l=i+1;
                r=Math.max(max,r+nums[i]);
                jumpsNeeded++;
            }
            else if(i<r){
                if(max<(r+nums[i])){
                    max=r+nums[i];
                }

            }

            if(r>=nums.length-1){
                break;
            }
        }
        return jumpsNeeded;
    }
}

