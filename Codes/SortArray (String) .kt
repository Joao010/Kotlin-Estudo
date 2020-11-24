import java.util.*
import java.lang.*
private fun rs() = readLine()!! // string line
private fun rei() = rs().toInt() // single int
private fun red() = rs().toDouble() // single double
private fun rds() = rs().split(" ") // list of strings
private fun rdi() = rds().map { it.toInt() } // list of ints
private fun rdd() = rds().map { it.toDouble() } // list of doubles

fun selector(s : String):Char = s[1]  //by the second letter

fun main(args: Array<String>) {
    var ns = Array(2){ i -> (i * i).toString() }
    ns[0] = "abau"
    ns[1] = "babu"
    ns.sortBy({selector(it)})
    for(v in ns){
        println(v)
    }
    
    /*
    Output:
    babu
    abau*/
}
