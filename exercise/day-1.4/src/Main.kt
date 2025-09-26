//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Soal 1
    val nilai = arrayOf(70, 85, 90, 60, 75)
    var total = 0
    for (n in nilai) {
        total += n
    }
    println("Total nilai = $total")

    // Soal 2
    val angka = listOf(1,2,3,4,5,6,7,8,9,10)
    for (a in angka) {
        if (a % 2 != 0) continue
        println(a)
    }

    // Soal 3
    val fruits = listOf("Apple", "Banana", "Mango", "Orange", "Grapes")
    for (f in fruits) {
        if (f == "Mango")
            println("Mango Ditemukan!")
            break
    }

    //Soal 4
    var i = 10
    while (i >= 1) {
        println(i)
        i--
    }
    println("Selesai!")

    //Soal 5
    val names = listOf("Andi", "Budi", "Cici", "Dedi")
    for ((index, name) in names.withIndex()) {
        println("${index + 1}. $name")
    }
}