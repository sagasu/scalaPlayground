package playground

class FactorialPlayground {
  def factNoTailRecursion(n:Int): Int = 
    if(n == 0) 1
    else n * factNoTailRecursion(n-1) 
  
  def fact(n: Int) = factHelper(n,1)
  
  def factHelper(n:Int, acc: Int):Int = {
    println(n.toString())
    
    if(n == 0) acc
    else factHelper(n-1,acc*n)
  }
}