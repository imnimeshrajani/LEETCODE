class Solution {
    public int findMinDifference(List<String> timePoints) {
        // List<Integer> minutes = new ArrayList<>();
        // int ans = Integer.MAX_VALUE;
        // for(String time : timePoints) {
        //     int hours = Integer.valueOf(time.substring(0, 2));
        //     int min = Integer.valueOf(time.substring(3, 5));
        //     // minutes.add(Math.min((hours * 60) + min, 1440 - ((hours * 60) + min)));
        //     minutes.add((hours < 13) ? ((hours + 24) * 60) + min : (hours * 60) + min);
        //     // System.out.println(hours);
        //     // System.out.println(min);
        //     // System.out.println((hours * 60) + min);
        // }
        // Collections.sort(minutes);
        // System.out.println(minutes);
        // for(int i = 1; i < minutes.size(); i++) {
        //     ans = Math.min(ans, minutes.get(i) - minutes.get(i - 1));
        // } 
        // return ans;

        if (timePoints.size() > 1440) return 0; 
        boolean[] selectedTime = new boolean[24 * 60];
        for(String time : timePoints) {
            int hours = Integer.valueOf(time.substring(0, 2));
            int min = Integer.valueOf(time.substring(3, 5));
            if(selectedTime[(hours * 60) + min]) return 0;
            selectedTime[(hours * 60) + min] = true;
        }
        int start = 0, end = selectedTime.length - 1, ans = Integer.MAX_VALUE, lastPoint = 0;
        while(!selectedTime[start]) start++;
        while(!selectedTime[end]) end--;
        lastPoint = start;
        for(int i = start + 1; i <= end; i++) {
            if(selectedTime[i]) {
                ans = Math.min(ans, i - lastPoint);
                lastPoint = i;
            }
        }
        return Math.min(ans, (24 * 60 - end + start));
    }
}