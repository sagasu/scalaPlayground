object Hi {
  def main(args: Array[String]) = println("Hi!" + factorial(30) + " " + Apollo.Appl())

  def factorial(x:BigInt): BigInt =
    if(x == 0) 1 else x * factorial(x-1)
}
