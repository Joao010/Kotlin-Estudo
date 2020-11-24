import java.util.*
import java.lang.*
private fun rs() = readLine()!! // string line
private fun rei() = rs().toInt() // single int
private fun red() = rs().toDouble() // single double
private fun rds() = rs().split(" ") // list of strings
private fun rdi() = rds().map { it.toInt() } // list of ints
private fun rdd() = rds().map { it.toDouble() } // list of doubles

fun selector(s : String):String = s

fun main(args: Array<String>) {
    val (t, k) = rdi()
    var ns = Array(t){ i -> (i * i).toString() }
    for(i in 0..t-1){
        val p = rs()
        ns[i] = p
    }
    ns.sortBy({selector(it)})
    println(ns[k-1])
}
