package hackerRankFunctionalProgramming.listReplication

object ListReplication {
  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(x => x < delim)
}
