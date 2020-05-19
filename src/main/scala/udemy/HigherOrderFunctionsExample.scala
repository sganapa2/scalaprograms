package udemy

import scala.annotation.tailrec

object HigherOrderFunctionsExample extends App {

  val lst = List(1,2,3)

  val chars : List[Char]= List('a','b','c')

  val accumulatorSum = (x: Int, y: Int) => x+y

  println(s" Sum of ints is: ${lst.foldLeft(0)(accumulatorSum)}")
  println(s" Sum of ints is: ${lst.sum}")

  println(lst.flatMap(x => chars.map(c => (x->c))))

  def fact(x : BigInt) : BigInt = x match {
    case a if a<=1 => 1
    case _ => x * fact(x-1)

  }

  //println(s" Factorial result of 5 is: ${fact(100000)}")

  // Using Tailrec => Where last statement of the function must be the call to the same recursive function
  //To prevent StackOverFlowException

  @tailrec
  def tailRecFact(x: BigInt, result: BigInt) : BigInt = {
    if(x<=1) result
    else {
      //println(s" x= $x result=$result")
      tailRecFact(x-1, result*x)
    }
  }

  //println(s" Tailrec Factorial result of 5 is: ${tailRecFact(100000,1)}")
  println(s" Tailrec Factorial result of 5 is: ${tailRecFact(5,1)}")

}
