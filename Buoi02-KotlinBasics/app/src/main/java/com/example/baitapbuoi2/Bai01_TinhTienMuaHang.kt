// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun main() {
    val soLuong: Int = 5
    val donGia: Double = 15000.0


    val tienHang: Double = soLuong.toDouble() * donGia

    val phanTramThue = 0.08
    val thue: Double = tienHang * phanTramThue
    val tongTien: Double = tienHang + thue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế VAT (8%): $thue VNĐ")
    println("Tổng tiền cuối cùng: $tongTien VNĐ")
}
