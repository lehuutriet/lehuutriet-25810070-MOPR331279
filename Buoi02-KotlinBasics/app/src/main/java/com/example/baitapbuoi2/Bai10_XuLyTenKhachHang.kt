
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainKhachHang() {
    val tenKhachHang: String? = null

    val doDaiTen = tenKhachHang?.length
    println("Độ dài tên khách hàng (dùng safe call): $doDaiTen")

    val tenHienThi = tenKhachHang ?: "khách vãng lai"
    println("Xin chào $tenHienThi")


    try {
        val tenBatBuoc = tenKhachHang!!
        println("Tên bắt buộc: $tenBatBuoc")
    } catch (e: Exception) {
        println("\nĐã xảy ra lỗi NPE do dùng !! với biến null: ${e.message}")
    }
}
