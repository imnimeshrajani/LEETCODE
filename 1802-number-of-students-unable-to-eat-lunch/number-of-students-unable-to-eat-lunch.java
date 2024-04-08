class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Queue<Integer> sandwichesQ = new LinkedList<>(), studentsQ = new LinkedList<>();
        // for(int i : students) studentsQ.add(i);
        // for(int i : sandwiches) sandwichesQ.add(i);
        // int count = 0;
        // while (!sandwichesQ.isEmpty()) {
        //     int a = sandwichesQ.peek(), b = studentsQ.poll();
        //     if(a != b) {
        //         studentsQ.add(b);
        //         count++;
        //         if(count == studentsQ.size()) break;
        //     } else {
        //         sandwichesQ.poll();
        //         count = 0;
        //     }
        // }
        // return studentsQ.size();

        int CSW = 0, SSW = 0;

        for (int student : students){
            if (student == 1){
                SSW++;
            } else {
                CSW++;
            }
        }

        for (int sandwiche : sandwiches){
            if (sandwiche == 1 && SSW > 0){
                SSW--;
            } else if (sandwiche == 0 && CSW > 0){
                CSW--;
            } else {
                return SSW + CSW;
            }
        }
        return 0;
    }
}