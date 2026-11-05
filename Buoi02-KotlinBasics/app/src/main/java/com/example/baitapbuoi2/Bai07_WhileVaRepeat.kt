
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainLoop() {
    println("Đếm ngược từ 10 về 1 ")
    var so = 10
    while (so >= 1) {
        println(so)
        so--
    }

    println(" In dòng cố định 5 lần ")
    repeat(5) {
        println("Đây là một dòng cố định.")
    }
}
