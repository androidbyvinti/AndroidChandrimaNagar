/*

 *          row = 1,5/0,4 and column = 1,5/0,4
 **
 ***
 ****
 *****

A               //
AB
ABC
ABCD
ABCDE

 */


fun main(args: Array<String>) {
            //97 + 1 --> 98 -->char --> b
    println('a' + 1)
    println("a" + 1)
    // char --> ascii --> manipulation --> ascii --> char --> output
    for(row in 'A'..'E' step 1) // 2<=5
    {
        for(column in 'A'..row) // 2<=1
        {
            print(column) // *
        }
        println()
    }

}