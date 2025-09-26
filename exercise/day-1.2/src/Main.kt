//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Bagian 1
    var length : Int = 7
    var width : Int = 4
    println("hitung luas persegi panjang = ${length * width}")

    var radius : Int = 10
    println("Hitung keliling lingkaran = ${2 * 3.14 * radius}")

    var sisa : Int = 200%7
    println("Sisa dari 200 % 7 = $sisa")

    //Bagian 2
    val x = 100
    val y = 200
    print("x < y = ${x < y}")
    println()

    val temp : Double = 36.5
    print("36.5 == 37.0? = ${temp == 37.0}")
    println()

    var a = 50
    var b = 50
    println("Apakah a = b? : ${a == b}")
    println()

    //Bagian 3
    var isSunny : Boolean = true
    var isRaining : Boolean = false
    println("Is it Sunny today? ${isSunny && !isRaining}")

    var hasMoney : Boolean = true
    var isStoreOpen : Boolean = false
    println("Bisa beli ga? ${hasMoney && isStoreOpen}")

    var isWeekend : Boolean = true
    var isHoliday : Boolean = false
    println("Apakah hari ini libur?: ${isWeekend || isHoliday}")

    //Bagian 4
    var num = 8
    num = ((num + 5) * 2 - 3) / 5
    println("Hasil akhir num = $num")

    var price = 1000
    price -= price * 20 / 100
    println("Harga setelah diskon = $price")

    //Bagian 5
    // 1. Counter dengan ++ dan --
    var counter = 10
    counter++
    counter++
    counter--
    counter--
    counter--
    println("Hasil akhir counter = $counter")

    // 2. Points dengan ++ dan --
    var points = 0
    points++
    points++
    points++
    points++
    points++
    points--
    println("Hasil akhir points = $points")
}

