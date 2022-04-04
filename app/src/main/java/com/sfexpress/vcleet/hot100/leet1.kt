package com.sfexpress.vcleet.hot100

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        var i = 0
        nums.forEach {
            map[it] = i++
        }
        map.forEach{
            val key = target - it.key
            val value : Int? = map[key]
            if(value != null){
                return intArrayOf(it.key, value)
            }
        }

        return intArrayOf(0,0)
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    val map = mutableMapOf<Int, Int>()
    var i = 0
    nums.forEach {
        val other = target - it
        if(map.keys.contains(other)){
            return intArrayOf(i, map[other]!!)
        }
        map[it] = i
        i++
    }

    return null
}

fun main(){
    val array = intArrayOf(3,3)
    val target = 6
    print(twoSum(array, target)?.toList())
}