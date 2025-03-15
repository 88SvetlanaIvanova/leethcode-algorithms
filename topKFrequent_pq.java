public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry entry : frequencyMap.entrySet()) {
            pq.add(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k ; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
