import scalaz._
import std.option._, std.list._

object Apollo {
  def Appl() = Apply[Option].apply2(some(1), some(2))((a, b) => a + b)
}
