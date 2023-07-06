fun main() {
val myStack=Stack()
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.isEmpty())
    myStack.push(34)
    myStack.push(12)
    println(myStack.peek())
    myStack.push(3)
    myStack.push(7)
    myStack.pop()
    println(myStack.peek())
    var x =myStack.pop()
    var y =myStack.pop()
    var z=x!! + y!!.code
//    the exclamation marks is for null assertion
//    safe call use it in emails if the type is nullable
    println(z)
//println(reverse("Hello"))


}
class Stack{
//    Adding data to the stack
    var data = mutableListOf<Char>()
    fun push(value: Int){
        data.add(value.toChar())
    }
//    removing data
    fun pop():Char? {
    if (data.isEmpty()) {
        return null
    }
    var top =data[data.lastIndex]
    data.removeAt(data.lastIndex)
    return top
}
//    peek element at the top without removing it
    fun peek():Char?{
        if (data.isEmpty()){
            return null
        }
    return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}
fun reverseWithStack(str:String):String{
    val stack =Stack()
    for (char in str){
        stack.push(character)
    }
    val result = mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return reverseWithStack(str)
}
//
//fun reverse(str:String):String{
//    var result = mutableListOf<Char>()
//    for (i in str.lastIndex downTo 0){
//        result.add(str[i])
//    }
//    return result.joinToString ("")
//}
//



















//pop remove
//how to implement a fixed size stack
//push add an item
//peek current item at the top