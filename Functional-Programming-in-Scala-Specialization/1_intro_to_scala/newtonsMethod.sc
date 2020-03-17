
def abs(x : Double) = if (x < 0) -x else x


// 1.6 wrapped the inner functions in the scope of sqrt
// so only sqrt can access them
def sqrt(x: Double) = {
  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  sqrtIter(1.0, x)
}

sqrt(2)
sqrt(1e-6)
// 1.6 refactored by eliminating redundant variables inside the scope

def sqrt2(x: Double) = {
  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  sqrtIter(1.0)
}
println("Refactored test")
sqrt(2)