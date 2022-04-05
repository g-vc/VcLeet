package com.sfexpress.vcleet.hot100

import kotlin.math.min


//1.Coin change
//● 你有三种硬币，2元，5元和7元，每种有足够多
//● 买一本书需要27元
//● 如何用最少的硬币组合付清，不需要对方找钱
fun coinChange(coin : IntArray, sum : Int) : Int{
    //结果数组,数组下表代表不同阶段的sum
    val f = IntArray(sum + 1)
    //初始条件
    f[0] = 0
    val len = coin.size
    for (i in 1 .. sum){
        //为结果数组附上初始值
        f[i] = Int.MAX_VALUE
        //转移方程
        for(j in 0 until len){
            //边界情况
            if(i >= coin[j] && f[i - coin[j]] != Int.MAX_VALUE){
                f[i] = min(f[i - coin[j]] + 1, f[i])
            }
        }
    }

    if(f[sum] == Int.MAX_VALUE){
        f[sum] = -1
    }

    return f[sum]
}

fun main() {
    val coin = intArrayOf(2, 5, 7)
    val sum = 27
    val result = coinChange(coin, sum)
    print(result)
}