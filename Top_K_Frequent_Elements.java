public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    List<Integer>[] buckets = new List[nums.length + 1];
         for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
             buckets[entry.getValue()].add(entry.getKey());
         }

         int[] result = new int[k];
         int index = 0;

        for (int i = nums.length; i >= 0; i--) {
            if (buckets[i].size() > 0) {
                for (int num : buckets[i]) {
                    if (index < k) {
                        result[index++] = num;
                    } else {
                        return result;
                    }
                }
            }
        }

        return result;
    }
