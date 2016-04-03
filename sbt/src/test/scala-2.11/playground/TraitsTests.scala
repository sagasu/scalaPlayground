package playground
import org.scalatest.FunSuite

class TraitsTests extends FunSuite {
  test("Check inheritance, multiple inheritance, and inheritance per instance"){
    assert(new Traits().peter != new Human("Peter"))
  }
}