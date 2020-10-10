package com.example.drawabledemo

import kotlin.random.Random

/**
 * Created at 10:35 2020/10/10
 * @author zmp
 *
 * des:
 */
class TestObject {

    val list: Int
        get() {
            return Random.nextInt(10)
        }

}