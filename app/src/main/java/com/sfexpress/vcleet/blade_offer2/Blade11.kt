package com.sfexpress.vcleet.blade_offer2

/**
 * {类描述}
 *
 * @author veganchen
 * @since 2022/4/25 09:09
 */
fun minArray(numbers: IntArray): Int {
    var result = numbers[0]
    numbers.forEach {
        if(it < result){
            return it
        }
    }

    return result
}

fun binaryMinArray(numbers: IntArray): Int {
    var low = 0
    var high = numbers.size - 1
    while (low < high){
        val mid = (low + high) / 2
        if(numbers[mid] > numbers[high]){
            low = mid + 1
        } else if(numbers[mid] < numbers[high]){
            high = mid
        } else {
            high--
        }
    }

    return numbers[low]
}