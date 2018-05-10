// when


fun main(args: Array<String>) {

    var value1 = 10
    var value2 = 90
    var value3 = 65
    var max = 0

    var user = 'i'

//    when(user){
//        'a', 'A', 'I', 'u'-> print("vowel")
//        else->print("consonant")
//    }


    max = when{
        value1>value2 && value1>value3 -> {
            print("value1 is greater")
            value1
        }
        value2>value3 -> value2
        else-> value3
    }
    
}

