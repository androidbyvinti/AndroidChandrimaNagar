// if-else
// when

// DecisionMakingStatement

// java

// Kotlin -->



fun main(args: Array<String>) {

    var value1 = 90
    var value2 = 434
    var max = 0

//    if(value1>value2) {
//        max = value1
//        print("Value1 is greater")
//    }
//        else{
//        max = value2
//        print("Value2 is greater")
//    }

    max = if(value1>value2) {
        print("Value1 is greater")
        value1
    }
    else{
        print("Value2 is greater")
        value2
    }


    if(value1%2==0) print("Even") else print("Odd")



    print(max)
}

