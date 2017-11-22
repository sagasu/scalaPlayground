package hackerRankFunctionalProgramming.helloWorldNTimes

object HelloWorldNTimes {
  def f(n: Integer){
    (0 until n).foreach(_ => println("Hello World"));
  }
}
