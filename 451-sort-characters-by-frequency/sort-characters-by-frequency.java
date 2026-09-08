class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Put characters into a list
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Step 3: Sort characters according to frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Build the answer
        StringBuilder result = new StringBuilder();

        for (char ch : list) {
            for (int i = 0; i < map.get(ch); i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}