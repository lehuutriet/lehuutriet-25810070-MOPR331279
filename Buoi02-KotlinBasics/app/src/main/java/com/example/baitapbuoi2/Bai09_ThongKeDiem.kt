
// Họ tên: Lê Hữu Triết - MSSV: 25810070
package com.example.baitapbuoi2

fun mainThongKe() {
    val diemSinhVien = arrayOf(8.5, 7.0, 9.0, 6.5, 10.0, 5.5, 8.0, 7.5, 9.5, 6.0)

    var tongDiem = 0.0
    var diemCaoNhat = diemSinhVien[0]
    var diemThapNhat = diemSinhVien[0]


    for (diem in diemSinhVien) {
        tongDiem += diem

        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }

        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / diemSinhVien.size

    println("Điểm của cả lớp: ${diemSinhVien.joinToString()}")
    println("Điểm trung bình: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
