package hackerRankFunctionalProgramming.filterPositionInAList

object FilterPositionInAList {
  def f(arr:List[Int]):List[Int] = arr.zipWithIndex.filter{case(x, index) => index % 2 != 0}.map(_._1);
}
