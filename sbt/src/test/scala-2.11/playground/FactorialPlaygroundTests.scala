package playground

import org.scalatest.FunSuite

class FactorialPlaygroundTests extends FunSuite {
  test("Factorial of 3 should return 6"){
    assert(new FactorialPlayground().fact(3) == 6)
  }
}