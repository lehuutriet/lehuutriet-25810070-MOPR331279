
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainTaiKhoan() {


    val soDuBanDau: Long = 5000000L
    var soDuHienTai: Long = soDuBanDau

    println("So du ban dau: $soDuHienTai VNĐ")
    soDuHienTai += 2000000L
    println("Sau khi gửi 2.000.000 VNĐ, số dư hiện tại: $soDuHienTai VNĐ")


    soDuHienTai -= 1500000L
    println("Sau khi rút 1.500.000 VNĐ, số dư hiện tại: $soDuHienTai VNĐ")

    println("Số dư ban đầu để đối chiếu: $soDuBanDau VNĐ")
}
