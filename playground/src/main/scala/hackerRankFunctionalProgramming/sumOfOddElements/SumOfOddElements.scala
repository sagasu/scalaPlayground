package hackerRankFunctionalProgramming.sumOfOddElements

object SumOfOddElements {
  def f(arr:List[Int]):Int = arr.fold(0)((agr,x) => if(x % 2 != 0 ) agr + x else agr)
}
