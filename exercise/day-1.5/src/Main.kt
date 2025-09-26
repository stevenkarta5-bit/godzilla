//Soal 1
fun calculateRectangleArea(length: Int, width: Int) : Int {
    return length * width
}

//Soal 2
fun checkEvenOdd(number: Int) : String {
    return if (number % 2 == 0) "Genap" else "Ganjil"
}

//Soal 3
fun sayHi (name: String = "Guest") {
    println("Hi $name!")
}

//Soal 4
fun square(n: Int) = n * n

//Soal 5
fun sumList(numbers: List<Int>) : Int {
    var total = 0
    for (i in numbers) {
        total += i
    }
    return total
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Soal 1
    println("Luas persegi panjang = " + calculateRectangleArea(8, 5))

    // Soal 2
    println("Angka 7 adalah: " + checkEvenOdd(7))

    // Soal 3
    sayHi()          // tanpa parameter
    sayHi("Andi")    // dengan parameter

    // Soal 4
    println("Kuadrat dari 9 = " + square(9))

    // Soal 5
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Jumlah list = " + sumList(numbers))

}