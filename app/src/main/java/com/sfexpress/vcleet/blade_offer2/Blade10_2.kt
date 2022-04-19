package com.sfexpress.vcleet.blade_offer2

/**
 * 青蛙跳台阶，可考虑动态规划
 *
 * @author veganchen
 * @since 2022/4/19 09:15
 */

fun numWays(n: Int): Int {
    val mod = 1000000007
    if(n < 2){
        return 1
    }
    //初始条件
    var p = 1
    var q = 1
    var r = 0
    for(i in 2 .. n){
        r = (p + q) % mod
        p = q
        q = r
    }

    return r
}