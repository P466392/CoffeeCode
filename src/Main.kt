//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    calculateCaffeeLevel()
}

fun calculateCaffeeLevel() {
    print("How many hours have you currently worked: ")
    var hoursDone = readLine()!!.toInt()
    print("How many more hours did you need to work: ")
    var hoursMore = readLine()!!.toInt()
    var tiredLevel = "null"
    while (tiredLevel == "null") {
        print("How tried are you? ")
        println("(Energetic, Okay, Tired, KO)")
        tiredLevel = readLine()!!
        if (tiredLevel == "Energetic") {
            continue
        } else if (tiredLevel == "Okay") {
            continue
        } else if (tiredLevel == "Tired") {
            continue
        } else if (tiredLevel == "KO") {
            tiredLevel = "KO"
        } else {
            println("Please enter the following options: Energetic, Okay, Tired, KO")
            tiredLevel = "null"
        }
    }
    println(tiredLevel)
    println(hoursMore)
    println(hoursDone)
}