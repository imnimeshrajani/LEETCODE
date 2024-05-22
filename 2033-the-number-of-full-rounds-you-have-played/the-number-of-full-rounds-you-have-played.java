class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        int loginHour = Integer.parseInt(loginTime.substring(0, 2));
        int logoutHour = Integer.parseInt(logoutTime.substring(0, 2));
        int loginMinute = Integer.parseInt(loginTime.substring(3, 5));
        int logoutMinute = Integer.parseInt(logoutTime.substring(3, 5));
        // System.out.println(loginHour + " "  + logoutHour);
        // System.out.println(loginMinutes + " "  + logoutMinutes);
        
        int start = loginHour * 60 + loginMinute, end = logoutHour * 60 + logoutMinute;
        if(start > end) end += 24 * 60;
        int ans = (int) Math.floor(end / 15.00) - (int) Math.ceil(start / 15.00);
        return ans < 0 ? 0 : ans;
    }
}