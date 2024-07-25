class Solution {
    public int[] sortArray(int[] nums) {
        int min= nums[0], max = nums[0];
        for(int val : nums) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        int n = max - min, index = 0, arr[] = new int[n + 1];

        for (int num : nums) arr[num - min]++;

        for (int i = 0; i <= n; i++) {
            while (arr[i]-- > 0) 
                nums[index++] = min;
            min++;
        }

        return nums;
        // mergeSort(nums, 0, nums.length - 1);
        // return nums;
    }

    void mergeSort(int[] nums, int left, int right) {
        if(left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {
        int size1 = mid - left + 1, size2 = right - mid, arrLeft[] = new int[size1], arrRight[] = new int[size2], i, j, k;
        for(i = 0; i < size1; i++) arrLeft[i] = nums[left + i];
        for(j = 0; j < size2; j++) arrRight[j] = nums[mid + j + 1];
        i = j = 0;
        k = left;
        while(i < size1 && j < size2) nums[k++] = (arrLeft[i] < arrRight[j]) ? arrLeft[i++] : arrRight[j++];
        while(i < size1) nums[k++] = arrLeft[i++];
        while(j < size2) nums[k++] = arrRight[j++];
    }


}