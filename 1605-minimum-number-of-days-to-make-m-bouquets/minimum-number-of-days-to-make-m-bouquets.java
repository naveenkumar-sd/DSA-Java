class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int val : bloomDay) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        int start = min, end = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possible(bloomDay, m, k, mid)) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean possible(int[] bloomDay, int m, int k, int d) {
        int count = 0, noBou = 0;

        for (int num : bloomDay) {
            if (num <= d) {
                count++;
                if (count == k) {
                    noBou++;
                    count = 0;
                    if (noBou >= m) return true;  // early exit
                }
            } else {
                count = 0;
            }
        }
        return noBou >= m;
    }
}
