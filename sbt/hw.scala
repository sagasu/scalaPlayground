object Hi {
  def main(args: Array[String]) = {
    val oper = new Operations
    oper.sumMore(1,2)
    oper.printArray()
    println("Hi!" + factorial(30) + " " + Apollo.Appl() + " " + addGreetings)
  }

  def factorial(x:BigInt): BigInt =
    if(x == 0) 1 else x * factorial(x-1)

  def addGreetings():String = {
    val greetings = new Array[String](3)
    //greetings.update(0) = "hello";
    greetings(0) = "hello"
    greetings(1) = "foo"
    greetings(0) = "bar"
    greetings.mkString(" ")
  }
}
