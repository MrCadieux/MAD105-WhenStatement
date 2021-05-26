fun main() {
    var number: Int
    var spanishNumber: String

    print("Please enter a number 1-10: ")
    number = readLine()!!.toInt()

    when (number) {
        1 -> spanishNumber = "uno"
        2 -> spanishNumber = "dos"
        3 -> spanishNumber = "tres"
        4 -> spanishNumber = "quatro"
        5 -> spanishNumber = "cinco"
        6 -> spanishNumber = "seis"
        7 -> spanishNumber = "siete"
        8 -> spanishNumber = "ocho"
        9 -> spanishNumber = "nueve"
        10 -> spanishNumber = "diez"
        !in 1..10 -> spanishNumber = "Not with in the range"
        else -> spanishNumber = "NaN"
        }

        println("The number $number in Spanish is $spanishNumber")
}