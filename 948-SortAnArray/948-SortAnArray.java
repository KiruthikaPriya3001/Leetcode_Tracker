// Last updated: 7/14/2026, 2:10:03 PM
class Solution {
    public int[] sortArray(int[] arr) {
        return split(arr);
    }
    public int[] split(int[] arr) {
        int len = arr.length;
        if (len <= 1) return arr;
        int mid = len / 2;
        int[] leftarray = new int[mid];
        int[] rightarray = new int[len - mid];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (i < mid) {
                leftarray[i] = arr[i];
            } else {
                rightarray[j] = arr[i];
                j++;
            }
        }
        leftarray = split(leftarray);
        rightarray = split(rightarray);
        return merage(leftarray, rightarray, arr);
    }
    public int[] merage(int[] leftarray, int[] rightarray, int[] arr) {
        int lsize = arr.length / 2;
        int rsize = arr.length - lsize;
        int i = 0, le = 0, ri = 0;
        while (le < lsize && ri < rsize) {
            if (leftarray[le] < rightarray[ri]) {
                arr[i] = leftarray[le];
                i++;
                le++;
            } else {
                arr[i] = rightarray[ri];
                i++;
                ri++;
            }
        }
        while (le < lsize) {
            arr[i] = leftarray[le];
            i++;
            le++;
        }
        while (ri < rsize) {
            arr[i] = rightarray[ri];
            i++;
            ri++;
        }
        return arr;
    }
}