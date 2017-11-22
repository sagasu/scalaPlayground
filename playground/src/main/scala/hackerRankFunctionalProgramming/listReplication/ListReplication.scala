package hackerRankFunctionalProgramming.listReplication

object ListReplication {
  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x =>   List.range(0, num).map(_ => x ));
}
