package com.sfexpress.vcleet.blade_offer2;

/**
 * {类描述}
 *
 * @author veganchen
 * @since 2022/4/6 07:15
 */
class Blade2 {
    //线性查找
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
//            return false;
//        }
//        //列数
//        int n = matrix[0].length;
//        //行数
//        int m = matrix.length;
//        //右上角元素
//        int i = 0;
//        int j = n - 1;
//        while (i < m && j >= 0){
//            if(matrix[i][j] == target){
//                return true;
//            }
//            if(matrix[i][j] > target){
//                j--;
//            } else {
//                i++;
//            }
//        }
//
//        return false;
//    }

    //二维二分查找
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        //取第一列做二分查找，这里时间复杂度O（n）,所以不会比线性查找更快
        return false;
    }

    //二分查找,找不到就返回小于目标的最近的元素下标
    public static int nearSearch(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int value = nums[mid];
            if(value == target){
                return mid;
            }
            if(value > target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(right >= 0 ){
            return right;
        }

        return -1;
    }

    //二分查找
    public static int bSearch(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int value = nums[mid];
            if(value == target){
                return mid;
            }
            if(value > target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
