//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Bagian 1
    var studentName : String = "Steven Kartawinata"
    println(studentName)
    var age : Int = 23
    println(age)
    var temperature : Double = 36.7
    println(temperature)
    var isGraduated : Boolean = false
    println(isGraduated)
    var grade : Char = 'A'
    println(grade)

    // Bagian 2
    var population : Long = 273_000_000
    var smallNumber : Short = 32000
    var tinyValue : Byte = 127
    println("Population: $population, SmallNumber: $smallNumber, TinyValue: $tinyValue")

    //Bagian 3
    var nickname : String? = "Steven"
    println("Sebelum diisi nickname: $nickname")

    nickname = "Master Coder"
    println("Setelah di inject nickname: $nickname")

    //Bagian 4
    var numbers:Array<Int> =arrayOf(1, 2, 3, 4, 5)
    println("Array numbers: ${numbers.joinToString ()}")

    var listOfFruits: List<String> =listOf("Apple", "Banana", "Mango")
    println("List listOfFruits: $listOfFruits")

    var muteableListOfScores = mutableListOf(80, 85, 90)
    muteableListOfScores.add(95)
    println("Mutable list of scores: $muteableListOfScores")

    // Set
    var setOfNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Set of numbers (duplikat otomatis dihapus): $setOfNumbers")

    // Map
    var mapOfStudent = mapOf("Math" to 90, "Science" to 85)
    println("Map of student: $mapOfStudent")

    //Bagian 5

        var city = "Jakarta"
        var year = 2025
        var pi = 3.14159
        println("City: $city, Year: $year, Pi: $pi")

        var isLoggedIn = false
        println("Before: $isLoggedIn")
        isLoggedIn = true
        println("After: $isLoggedIn")

        // Array of characters
        val charList = arrayOf("S", "T", "E", "V", "E", "N")
        println("Char list: ${charList.joinToString()}")


    //Bagian 6
    // MutableMap
    val studentInfo = mutableMapOf<String, Any>(
        "name" to "Steven",
        "age" to 23,
        "score" to 89.5
    )
    studentInfo["isGraduated"] = false
    println("Student info: $studentInfo")

    // Array grades
    val grades = arrayOf("A", "B", "C", "D", "E")
    println("Nilai pertama: ${grades.first()}, Nilai terakhir: ${grades.last()}")

    // MutableList hobbies
    val hobbies = mutableListOf("Badminton", "Gaming", "Nonton")
    hobbies.remove("Gaming")
    println("Hobbies setelah dihapus: $hobbies")

}