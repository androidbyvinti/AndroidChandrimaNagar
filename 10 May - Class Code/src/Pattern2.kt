
/*

    *
   ***
  *****
 *******
*********


 */

fun main(args: Array<String>) {

    for(row in 1..5){
        for(space in 5 downTo row){
            print(" ")
        }
        for(column in 1..(2*row-1)){    // 1<= 5
            print("*")
        }
        println()
    }


}






