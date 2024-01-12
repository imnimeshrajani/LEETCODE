class Solution {
    public boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count1 = 0, count2 = 0;
        for(int i = 0; i < ch.length/2; i++) if(set.contains(ch[i])) count1++;
        for(int i = ch.length/2; i < ch.length; i++) if(set.contains(ch[i])) count2++;
        return count1 == count2;
    }
}