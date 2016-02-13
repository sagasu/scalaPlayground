package playground

class FactorialPlayground {
  def fact(n: Int) = factHelper(n,1)
  
  def factHelper(n:Int, acc: Int):Int = {
    println(n.toString())
    
    if(n == 0) acc
    else factHelper(n-1,acc*n)
  }
}