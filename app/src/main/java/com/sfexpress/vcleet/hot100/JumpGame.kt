package com.sfexpress.vcleet.hot100

fun main() {
    val stone1 = intArrayOf(2,3,1,1,4)
    val stone2 = intArrayOf(3,2,1,0,4)
    val result1 = jumpGame(stone1)
    val result2 = jumpGame(stone2)
    print("$result1 $result2")
}

fun jumpGame(stone : IntArray) : Boolean{
    if(stone.isEmpty()){
        return false
    }
    val result = BooleanArray(stone.size)
    val len = stone.size
    result[0] = true
    for(i in 1 until len){
        for(j in 0 until i){
            if(result[j] && stone[j] >= i - j){
                result[i] = true
                break
            }
        }
    }

    return result.last()
}