// https://codeforces.com/problemset/problem/118/A
// String Task

fun main() {
    val line = readln().lowercase() // read string from input, decapitalize
    val result = arrayListOf("") // create an empty array
    for (char in line.indices) { // go through string elements
        when (line[char]) { // check if element is a vowel
            'a', 'o', 'y', 'e', 'u', 'i' -> 0 // not an elegant solution, might need improvement (change to !in)
            else -> result.add("." + line[char]) // add non-vowels to result array
        }
    }
 
    print(result.joinToString("")) // print result as a string
 
}