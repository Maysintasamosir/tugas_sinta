fun main(args: Array<String>){
    val angka: Int = 6
    when(angka){
        3,4,5,6 -> print("It is summer season")
        6,7,9 -> println("It is rainy season")
        8,11, -> println("It is autumn season")
        10,12,1,2 -> println("It is winter season")
        else -> println("invalid input")
    }
}