
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainDanhSachSach() {
    // Khởi tạo danh sách 5 cuốn sách ban đầu
    val danhSachSach = mutableListOf(
        "Nhà Giả Kim",
        "Đắc Nhân Tâm",
        "Tội Ác Và Hình Phạt",
        "Ông Già Và Biển Cả",
        "Hoàng Tử Bé"
    )

    println("Danh sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("Hai Số Phận")
    danhSachSach.add("Bố Già")

    danhSachSach.remove("Đắc Nhân Tâm")

    danhSachSach.sort()

    println("\nDanh sách sau khi thêm, xoá và sắp xếp:")
    println(danhSachSach)
}
