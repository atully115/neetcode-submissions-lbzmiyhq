class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOut = new ArrayList<>();
        List<String> listIn = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        String arrSorted = "";
        for (int i = 0; i < strs.length; i++) {
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            arrSorted = new String(sorted);
            if(map.containsKey(arrSorted)) {
                map.get(arrSorted).add(strs[i]);
            } else {
                map.put(arrSorted, new ArrayList<>());
                map.get(arrSorted).add(strs[i]);
            }
        }
        map.forEach((key, list) -> {
            listOut.add(list);
        });
        return listOut;
    }
}
