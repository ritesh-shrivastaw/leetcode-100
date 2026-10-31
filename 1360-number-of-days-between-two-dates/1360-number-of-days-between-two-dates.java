class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(day(date1) - day(date2));
    }
    public int day(String date1){
      int arr[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] arr1 = date1.split("-");
        int year = Integer.valueOf(arr1[0]);
        int month = Integer.valueOf(arr1[1]);
        int day = Integer.valueOf(arr1[2]);
         int mon = 0;

        for (int i = 0; i < month - 1; i++) {
            mon += arr[i];
        }

        if ((year % 4 == 0 && year % 100 != 0
                || year % 400 == 0) && month > 2) {
            mon++;
        }

        int y = year - 1;

        int duration = (year - 1) * 365
                     + y / 4 - y / 100 + y / 400
                     + day + mon;

        return duration;
    }
}
   