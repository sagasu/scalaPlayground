package hackerRankFunctionalProgramming.sumOfOddElements

object SumOfOddElements {
  def f(arr:List[Int]):Int = arr.foldLeft(0)((x,agr) => if(x % 2 != 0 ) agr + x else agr)
}
