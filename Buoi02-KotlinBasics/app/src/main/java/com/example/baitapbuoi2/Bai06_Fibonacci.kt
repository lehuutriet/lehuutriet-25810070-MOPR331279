
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainFibonacci() {
    var f0 = 0
    var f1 = 1

    println("Vị trí 0: $f0")
    println("Vị trí 1: $f1")

    // Ước lượng giới hạn để tìm các số nhỏ hơn 100
    for (i in 2..20) {
        val fNext = f0 + f1
        if (fNext >= 100) {
            break
        }

        println("Vị trí $i: $fNext")

        f0 = f1
        f1 = fNext
    }
}
