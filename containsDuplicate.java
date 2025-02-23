class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> mySet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
         return (mySet.size() != nums.length);
    }
}

public class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
