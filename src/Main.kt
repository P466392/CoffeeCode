//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("How many hours have you currently worked: ")
    var hoursDone = readLine()!!.toInt()
    print("How many more hours did you need to work: ")
    var hoursMore = readLine()!!.toInt()
    print("How tried are you? ")
    println("(Energetic, Okay, Tired, KO)")
    var tiredLevel = readLine()!!.toString()

    println(tiredLevel)
    println(hoursMore)
    println(hoursDone)
}