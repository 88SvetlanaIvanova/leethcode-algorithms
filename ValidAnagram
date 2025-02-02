
    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> sStats= new HashMap<>();
        HashMap<String, Integer> tStats= new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            String symbol = STR."\{s.charAt(i)}";
           if (sStats.containsKey(symbol)) {
               sStats.put(symbol, sStats.get(symbol) + 1);
           }
            sStats.putIfAbsent(symbol, 1);
        }
        for (int i = 0; i <t.length(); i++) {
            String symbol = STR."\{t.charAt(i)}";
            if (tStats.containsKey(symbol)) {
                tStats.put(symbol, tStats.get(symbol) + 1);
            }
            tStats.putIfAbsent(symbol, 1);
        }
        return  sStats.equals(tStats);
    }
