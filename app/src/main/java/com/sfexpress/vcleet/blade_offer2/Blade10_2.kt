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
    //跳法数组
    val f = IntArray(n + 1)
    //初始条件
    f[0] = 1
    f[1] = 1
    for(i in 2 .. n){
        f[i] = (f[i - 1] + f[i - 2]) % mod
    }

    return f[n]
}