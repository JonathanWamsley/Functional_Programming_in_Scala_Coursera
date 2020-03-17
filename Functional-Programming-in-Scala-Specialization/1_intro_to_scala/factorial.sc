/* can give factorial a default total
*/
def factorial(n :Int, total:Int = 1): Int =
  if (n == 0) total else factorial(n-1, n * total)


factorial(4)
/* his method which involves creating another loop
   to keep track of his values
 */
def factorial2(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n ==0) acc
    else loop(n * acc, n-1)
  loop(1, n)
}

factorial2(4)