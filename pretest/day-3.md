#### **Optional (Choose the correct answer):**

1. Which of the following creates an immutable list in Kotlin?

   - a) `arrayOf(1, 2, 3)`
   - b) `listOf(1, 2, 3)` **benar**
   - c) `mutableListOf(1, 2, 3)` 
   - d) `setOf(1, 2, 3)`

2. What is the purpose of a coroutine in Kotlin?

   - a) To manage multiple threads
   - b) To handle asynchronous programming efficiently **benar**
   - c) To suspend functions indefinitely
   - d) To manage Android lifecycle events

3. Which activity lifecycle method is called when the activity is visible but not yet interactive?

   - a) `onCreate()`
   - b) `onResume()`
   - c) `onStart()` **benar**
   - d) `onPause()`

4. In Android UI, which ViewGroup arranges its children in a single direction (either horizontal or vertical)?

   - a) `RelativeLayout`
   - b) `ConstraintLayout`
   - c) `LinearLayout` **benar**
   - d) `FrameLayout`

5. What keyword is used to define a suspending function in Kotlin?
   - a) `async`
   - b) `launch`
   - c) `suspend` **benar**
   - d) `defer`

---

#### **Short Answer:**

6. What is the difference between `listOf()` and `mutableListOf()` in Kotlin?
- listOf() membuat list yang tidak bisa diubah (immutable).
- mutableListOf() membuat list yang bisa diubah (mutable), seperti menambah atau menghapus elemen.

7. How does `onDestroy()` differ from `onStop()` in the Android activity lifecycle?
- onStop() dipanggil saat aktivitas tidak lagi terlihat, tapi masih ada di memori.
- onDestroy() dipanggil saat aktivitas akan dihancurkan sepenuhnya, biasanya karena user menutup atau sistem membunuh aktivitas.

8. What is the advantage of using coroutines over threads in Kotlin?
- Coroutine lebih ringan, efisien, dan mudah dikelola.
- Tidak memblokir thread, sehingga cocok untuk operasi asynchronous seperti network atau database.

9. How can you prevent memory leaks in Android when handling configuration changes like screen rotation?
- Gunakan ViewModel untuk menyimpan data yang bertahan saat konfigurasi berubah.
- Hindari referensi langsung ke Activity atau Context dalam komponen yang bertahan lama. 
- Gunakan LiveData dan Lifecycle-aware components.

10. Explain the difference between `View` and `ViewGroup` in Android.
- View: Komponen UI tunggal (misalnya TextView, Button).
- ViewGroup: Kontainer yang bisa menampung banyak View (misalnya LinearLayout, ConstraintLayout).

11. How does a `RecyclerView` differ from a `ListView` in Android UI components?
- RecyclerView lebih fleksibel, efisien, dan mendukung ViewHolder pattern.
- ListView lebih sederhana tapi kurang efisien dan terbatas dalam kustomisasi.

12. What is the role of `onResume()` in the Android lifecycle?
- Dipanggil saat aktivitas mulai berinteraksi dengan pengguna.
- Aktivitas sudah terlihat dan siap menerima input

13. What is the purpose of `launch` in Kotlin coroutines?
- Untuk menjalankan coroutine baru tanpa mengembalikan hasil.
- Cocok untuk tugas yang tidak memerlukan nilai balik, seperti update UI.

14. What is `LiveData` in Android, and why is it useful?
- LiveData adalah data yang dapat diamati dan aware terhadap lifecycle.
- Berguna untuk menghindari memory leak dan update UI secara otomatis saat data berubah.

15. What is the `ViewModel` class used for in Android?
- Menyimpan dan mengelola data UI secara lifecycle-aware.
- Bertahan saat konfigurasi berubah (misalnya rotasi layar), sehingga data tidak hilang.

---

#### **Yes/No Questions:**

16. Can `setOf()` store duplicate elements in Kotlin? **No**

17. Is it possible to use coroutines with Android’s lifecycle-aware components like `LiveData`? **Yes**

18. Does the Android `onCreate()` method get called every time an activity becomes visible? **No**

19. Can a `ConstraintLayout` position elements relative to each other in Android? **Yes**

20. Are `RecyclerView` and `SwipeRefreshLayout` both advanced Android UI components? **Yes**

---

#### **Correct the Code (with Reasons for Correction):**

21. **Incorrect code:**
    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```
    **Correct code:**
    ```kotlin
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```
    untuk menambahkan elemen seperti diatas, harus menggunakan mutableListOf(), karena listOf() tidak bisa diubah


---

22. **Incorrect code:**
    ```kotlin
    fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```
    **Correct code:**
    ```kotlin
    suspend fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```
    Fungsi delay() adalah fungsi penangguhan (suspending function), dan hanya bisa dipanggil dari dalam fungsi yang ditandai dengan suspend atau dari dalam coroutine.
    Fungsi myCoroutine() harus ditandai dengan suspend agar bisa menggunakan delay().

---

23. **Incorrect code:**
    ```kotlin
    override fun onCreate() {
        super.onCreate()
        setContentView(R.layout.activity_main)
    }
    ```
    **Correct code:**
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    ```
    Metode onCreate() harus menerima parameter savedInstanceState: Bundle? karena itu bagian dari kontrak metode lifecycle di Android.
    Tanpa parameter tersebut, metode tidak akan override dengan benar dari kelas Activity atau AppCompatActivity, dan bisa menyebabkan error saat aplikasi dijalankan.

---

24. **Incorrect code:**
    ```kotlin
    val map = mapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```
    **Correct code:**
    ```kotlin
    val map = mutableMapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```
    mapOf() membuat immutable map, artinya kamu tidak bisa menambahkan atau mengubah isi map setelah dibuat.
    Untuk bisa menambahkan pasangan key-value seperti 3 to "Three", kamu harus menggunakan mutableMapOf(), yang memungkinkan modifikasi.
    

---

25. **Incorrect code:**
    ```kotlin
    val view = findViewById<Button>(R.id.button)
    view.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```
    **Correct code:**
    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)   
    val view = findViewById<Button>(R.id.button).setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```
    setContentView(...) harus dipanggil dulu supaya findViewById bisa menemukan view dari layout.
Variabel diketikkan sebagai Button agar jelas tipenya.
setOnClickListener { ... } dipasang ke instance button, bukan ke sembarang View.
    




---

### **Story-based Question (with Failed Code)**

#### **Story:**

You are developing an Android app for managing tasks. Each task has a title and a description. The app should allow users to add tasks and display the list of tasks in a `RecyclerView`. However, the app crashes when you try to display the list of tasks.

Here’s the failed code:

```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.itemView.findViewById<TextView>(R.id.taskTitle).text = task.title
        holder.itemView.findViewById<TextView>(R.id.taskDescription).text = task.description
    }

    override fun getItemCount() = taskList.size
}

data class Task(val title: String, val description: String)
```

**Correct code:**
```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.taskTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.taskDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.titleTextView.text = task.title
        holder.descriptionTextView.text = task.description
    }

    override fun getItemCount() = taskList.size
}

data class Task(val title: String, val description: String)
```
HTML Entities dihapus: <Task> dan <TextView> ditulis dengan benar.
ViewHolder dioptimalkan: TextView disimpan sebagai properti di TaskViewHolder, sehingga tidak perlu findViewById berulang kali.
Lebih efisien dan aman: Mengurangi kemungkinan crash karena findViewById gagal menemukan view.



---
