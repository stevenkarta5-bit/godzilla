//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Soal 1
    val nilai = 85
    if (nilai >= 90 || nilai <= 89) {
        println("Nilai A: Sangat baik")
    } else if (nilai >= 75) {
        println("Nilai B: Cukup Baik")
    } else if (nilai >= 60) {
        println("Nilai C: Perlu belajar lagi")
    } else {
        println("Nilai D: Tidak lulus")
    }

    //Soal 2
    val angka = 2
    val result = if(angka % 2 == 0) "Angka Genap" else "Angka Ganjil"
    println("result")

    //Soal 3
    println()
    val day = 3
    when (day){
        1 -> println("senin")
        2 -> println("selasa")
        3 -> println("rabu")
        4 -> println("kamis")
        5 -> println("jumaat")
        6 -> println("sabtu")
        7 -> println("minggu")
        else -> println("Hari ini tidak valid")
    }
    println()

    //Soal 4
    val grade =  'C'
    when (grade){
        'A', 'B' -> println("Lulus dengan baik")
        'C' -> println("lulus pas pasan")
        'D', 'E' -> println("tidak lulus")
        else -> println("Nilai tidak valid")
    }

    //Soal 5
    println()
    val month = 8
    val season = when (month){
        12, 1, 6 -> "musim hujan"
        3, 4, 5 -> "musim semi"
        9, 10, 11 -> "musim panas"
        else -> "Nilai tidak valid"
    }
    println("Bulan $month adalah $season")

}