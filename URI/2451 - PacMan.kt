import java.util.*
import java.lang.*
private fun rs() = readLine()!! // string line
private fun rei() = rs().toInt() // single int
private fun red() = rs().toDouble() // single double
private fun rds() = rs().split(" ") // list of strings
private fun rdi() = rds().map { it.toInt() } // list of ints
private fun rdd() = rds().map { it.toDouble() } // list of doubles

fun main(args: Array<String>) {
    val t = rei()
    var inn = 0
    var re = 0
    var sum = 0
    var ns = Array(t+1){ i -> (i * i).toString() }
    for(i in 0..t-1){
        val p = rs()
        ns[i] = p
    }
    for( v in ns ){
        if(inn == 0){
            for(i in 0..v.length-1){
                if(v[i]=='A'){
                    re = Math.max(re, sum)
                    sum = 0
                }else if(v[i]=='o')++sum
            }
            inn = 1
        }else{
            for(i in v.length-1 downTo 0){
                if(v[i]=='A'){
                    re = Math.max(re, sum)
                    sum = 0
                }else if(v[i]=='o')++sum
            }
            inn = 0
        }
    }
    re = Math.max(re, sum)
    println(re)
}
