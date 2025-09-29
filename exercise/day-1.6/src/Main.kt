//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nilaiUjian = listOf(70, 85, 90, 60)
    calculateStats(nilaiUjian)

    segitigaBintang()


    println(isPalindrome("level"))   // true
    println(isPalindrome("kotlin"))  // false


    val angka = listOf(10, 30, 20, 50, 40)
    val hasil = findSecondLargest(angka)

    if (hasil != null) {
        println("Angka tertinggi kedua adalah: $hasil")
    } else {
        println("Tidak ada angka tertinggi kedua.")
    }


    val kalimat = "Belajar Kotlin itu mudah"
    val jumlahKata = countWords(kalimat)
    println("Jumlah kata: $jumlahKata")

    matriksPenjumlahan()
}

// No 1
fun calculateStats(numbers: List<Int>) {
    var total = 0
    var max = numbers[0]
    var min = numbers[0]

    for (num in numbers) {
        total += num
        if (num > max) max = num
        if (num < min) min = num
    }

    val average = total.toDouble() / numbers.size

    println("Total: $total")
    println("Rata-rata: $average")
    println("Nilai maksimum: $max")
    println("Nilai minimum: $min")
}

// No 2
fun segitigaBintang() {
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

// No 3
fun isPalindrome(text: String): Boolean {
    val reversed = text.reversed()
    return text == reversed
}

// No 4
fun findSecondLargest(numbers: List<Int>): Int? {
    if (numbers.size < 2) return null // minimal 2 angka

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (num in numbers) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num != max) {
            secondMax = num
        }
    }

    return if (secondMax != Int.MIN_VALUE) secondMax else null
}

// No 5
fun countWords(sentence: String): Int {
    var count = 0
    var inWord = false

    for (char in sentence) {
        if (char != ' ') {
            if (!inWord) {
                count++
                inWord = true
            }
        } else {
            inWord = false
        }
    }

    return count
}

// No 6
fun matriksPenjumlahan() {
    val A = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val B = arrayOf(
        intArrayOf(7, 8, 9),
        intArrayOf(1, 2, 3)
    )

    val rows = A.size
    val cols = A[0].size

    val hasil = Array(rows) { IntArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            hasil[i][j] = A[i][j] + B[i][j]
        }
    }

    // Cetak hasil penjumlahan
    println("Hasil penjumlahan matriks:")
    for (i in hasil) {
        println(i.joinToString(" "))
    }
}