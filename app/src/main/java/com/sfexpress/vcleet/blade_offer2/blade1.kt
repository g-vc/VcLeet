package com.sfexpress.vcleet.blade_offer2

/**
 * 剑指 Offer 03. 数组中重复的数字
 *
 * @author veganchen
 * @since 2022/4/6 06:15
 */
class Solution {
    fun findRepeatNumber(nums: IntArray): Int {
        if(nums.isEmpty()){
            return -1
        }
        val set = HashSet<Int>()
        nums.forEach {
            if(set.contains(it)){
                return it
            }
            set.add(it)
        }

        return -1
    }
}