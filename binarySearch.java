 public int search(int[] nums, int target) {
              if (nums[nums.length/2] > target){
            for (int i = 0; i < nums.length/2 ; i++) {
                if (nums[i] == target){
                    return i;
                }
            }
        } else {
            for (int i = nums.length/2; i < nums.length ; i++) {
                if (nums[i] == target){
                    return i;
                }
            }
        }
        return -1;  
    }
