import java.math.BigInteger

object javaBInt{
def factorial(x: BigInteger) : BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorial(x.subtract(BigInteger.ONE)))
}
