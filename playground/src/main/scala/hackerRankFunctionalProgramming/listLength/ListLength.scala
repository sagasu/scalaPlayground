package hackerRankFunctionalProgramming.listLength

object ListLength {
  def f(arr:List[Int]):Int = arr.fold(0){ case(agr,x) => agr + 1}
}
