package hackerRankFunctionalProgramming.filterArray

class FilterArray {
  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(x => x < delim)
}
