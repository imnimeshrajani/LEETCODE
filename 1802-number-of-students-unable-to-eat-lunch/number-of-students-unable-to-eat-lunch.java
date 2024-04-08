class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> sandwichesQ = new LinkedList<>(), studentsQ = new LinkedList<>();
        for(int i : students) studentsQ.add(i);
        for(int i : sandwiches) sandwichesQ.add(i);
        int count = 0;
        while (!sandwichesQ.isEmpty()) {
            int a = sandwichesQ.peek(), b = studentsQ.poll();
            if(a != b) {
                studentsQ.add(b);
                count++;
                if(count == studentsQ.size()) break;
            } else {
                sandwichesQ.poll();
                count = 0;
            }
        }
        return studentsQ.size();
    }
}