### **Instructions:**

- For **optional questions**, select the correct answer.
- For **short answer questions**, provide a concise response.
- For **yes/no questions**, simply answer “yes” or “no.”
- For **correct-the-code questions**, review the provided code snippet, identify the mistake, and write the corrected version.

---

### **Pretest + Posttest Questions**

#### **Optional (Choose the correct answer):**

1. Which of the following is the correct way to declare a variable in Kotlin?

   -** a) `var x = 10`**
   - b) `let x = 10`
   - c) `dim x as 10`
   - d) `declare x = 10`

2. What keyword is used to declare a constant in Kotlin?

   - a) `let`
   - b) `const`
   - c) `final`
  ** - d) `val`**

3. How do you define a function in Kotlin?

   - a) `function myFunction() {}`
   - b) `def myFunction() {}`
  ** - c) `fun myFunction() {}`**
   - d) `lambda myFunction() {}`

4. What is the result of `5 % 2` in Kotlin?

   - a) `2.5`
  ** - b) `1`**
   - c) `0`
   - d) `5`

5. Which data type in Kotlin represents a true or false value?
   - a) `Int`
   - b) `String`
   **- c) `Boolean`**
   - d) `Float`

---

#### **Short Answer:**

6. What is the difference between `var` and `val` in Kotlin?
var: merupakan variable, dapat diubah atau bersifat (Mutable).
val: merupakan variable, tidak dapat diubah

7. How do you create a list in Kotlin?
inisialisasi 
val angka = listOf(1, 2, 3)

8. Write a simple `if-else` statement in Kotlin.
var x: Int = 5
if(x<=0) {
    println("Kocak")
} else {
    println("Ga Kocak")
}

9. How do you handle nullability in Kotlin?
penggunaan tanda '?' untuk variable yg nullable

10. What is a lambda function in Kotlin?
untuk anonymous function

11. How do you define a class in Kotlin?
class(masukan variable dan data type)

12. How do you use a `for` loop to iterate through a list in Kotlin?
for (i in 1..5) {
    println($i)
}

13. What does the `when` statement do in Kotlin?
penggunaan seperti switch case, dimana kondisi disesuaikan

14. How do you check if a number is even in Kotlin?
penggunaan modulus, jika dimodulus 2 menghasilkan 0 maka angka genap, penulisan: angka % 2 == 0

15. How do you declare an array in Kotlin?
val angka = arrayOf(1, 2, 3, 4)
---

#### **Yes/No Questions:**

16. Can `val` be reassigned to a new value after its initial assignment? **Tidak**

17. Does Kotlin support operator overloading? **Ya**

18. Is Kotlin fully interoperable with Java? **Ya**

19. Can a function in Kotlin return a value using `return` keyword? **Ya**

20. Can Kotlin's `when` statement be used as an expression to return values? **Ya**

---

#### **Correct the Code (with Answers):**

21. **Incorrect code:**

    ```kotlin
    val x = "Hello"
    x = "World"
    ```
    **koreksi**
    var x = "Hello"
    x = "World"

22. **Incorrect code:**

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    sum(5, 10)
    ```

    - **Correction**:

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    sum(5, 10)
    ```

23. **Incorrect code:**

    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)

    **Koreksi**
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```

24. **Incorrect code:**

    ```kotlin
    val name: String = null
    ```
    **koreksi**
    val name: String? = null

25. **Incorrect code:**

    ```kotlin
    if x > 5 {
        println("x is greater than 5")
    }
    ```
    **koreksi**
    if (x > 5) {
        printlnm("x is greater than 5")
    }

26. **Incorrect code:**

    ```kotlin
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else println("Other")
    }
    ```
    **koreksi**
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    }

27. **Incorrect code:**

    ```kotlin
    fun greet() {
        println("Hello, $name)
    }
    ```
    **koreksi**
    fun greet(name: String){
        println("Hello, $name")
    }


28. **Incorrect code:**

    ```kotlin
    val myVar = "10"
    val result = myVar + 5
    ```
    **koreksi**
    val myVar = "10"
    val result = myVar.toInt() + 5
    println(result)

29. **Incorrect code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[3])
    ```
    **koreksi**
    val numbers = arrayOf(1, 2, 3)
    println(numbers[2])

30. **Incorrect code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is " + name + " and I'm " + age)
        }
    }

    class Person(val name: String, val age: Int) {
    fun greet() {
        println("Hello, my name is $name and I'm $age")
    }
}
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

Imagine you are building a ticket booking system for a movie theater. Each customer can reserve a seat by providing their name and the seat number. The seat numbers are stored in an array, and the program should check if the seat is available. If available, the seat will be reserved, and if not, a message will be displayed to the user that the seat is taken.

Here’s the failed code:

```kotlin
fun reserveSeat(name: String, seatNumber: Int) {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```
**koreksi**

fun reserveSeat(name: String, seatNumber: Int, availableSeats: MutableList<Int>) {
    if (seatNumber in availableSeats) {
        // Hapus seat dari daftar available
        availableSeats[seatNumber - 1] = 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved or invalid.")
    }
}

fun main() {
    val availableSeats = mutableListOf(1, 2, 3, 4, 5)

    reserveSeat("John", 2, availableSeats)
    reserveSeat("Sarah", 2, availableSeats)
}

