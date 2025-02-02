 public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> remainders = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            remainders.put(nums[i], i);
        }

        for (int i = 0; i < nums.length ; i++) {
            int difference = target - nums[i];
                if (remainders.containsKey(difference) && remainders.get(difference) != i) {
                    return new int[] {i,remainders.get(difference)};
                }
        }
        return new int[0];
    }
