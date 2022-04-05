package com.sfexpress.vcleet.hot100


fun main() {
    val result = uniquePath(8, 4)
    print(result)
}

fun uniquePath(m : Int, n : Int) : Int{
    //结果数组，记录到每一个点有多少种方式
    val f = Array<IntArray>(n){
        IntArray(m)
    }
    //初始条件
    f[0][0] = 1
    for(i in 0 until n){
        for(j in 0 until m){
            if(i == 0 || j == 0){
                f[i][j] = 1
                continue
            }
            f[i][j] = f[i - 1][j] + f[i][j - 1]
        }
    }

    return f[n-1][m-1]
}