class GeneratorPattern {
  def generate(): Unit ={

  }

  //def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(_ =>   List.range(0, num).map(x => x ));
  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x =>   List.range(0, num).map(_ => x ));
  //def f(num:Int,arr:List[Int]):List[Int] = arr.foreach(_ =>   for (i <- 0 to num) yield i );
  //def f(num:Int,arr:List[Int]):List[Int] = List();

}
