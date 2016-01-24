class Operations{
  def sumMore(a:Int, b:Int):Int = {
    (a).+(b)
  }

  def printArray() = {
    //val cars = Array{"porshe", "fiat", "mustang", "opel"}
    val cars = List("porshe", "fiat", "mustang", "opel")
    for(car <- cars)
      println(car)
  }
}
