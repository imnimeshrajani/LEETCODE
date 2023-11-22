class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }
            else {
                map.put(temp, 1);
                count++;
            }
        }

        int k = s1.length();
        while(end < s2.length()) {

            char chEnd = s2.charAt(end);
            if(map.containsKey(chEnd)) {
                map.put(chEnd, map.get(chEnd) - 1);
                if(map.get(chEnd) == 0) {
                    count--;
                }
            }
            if(end - start + 1 < k) {
                end++;
            }
            else if(end - start + 1 == k) {
                if(count == 0) {
                    return true;
                }
                char chStart = s2.charAt(start);
                if(map.containsKey(chStart)) {
                    map.put(chStart, map.get(chStart) + 1);
                    if(map.get(chStart) == 1) {
                        count++;
                    }
                }
                start++;
                end++;
            }
        }
        return false;
    }
}