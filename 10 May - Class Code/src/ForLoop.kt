
fun main(args: Array<String>) {

    // 1 to 10

    // for(int i = 1; i<=10; i++){...}

//    for(i in 2..10 step 2)  // in keyword --> to use range operators
//    {
//        println(i)
//    }
//
//    for(i in 10 downTo 1 step 2)  // in keyword --> to use range operators
//    {
//        println(i)
//    }

    // int , string
    
    var values : Array<Int> = arrayOf(54, 87)  // value  --> Int , String

    println("array size = ${values.size}") // 1
    // 0.<10
     //0 < 2
    for(i in 0 until values.size)  // in keyword --> to use range operators
    {
        println(values[i])
    }

}



