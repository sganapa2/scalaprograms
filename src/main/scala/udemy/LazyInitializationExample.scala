package udemy

object LazyInitializationExample extends  App {

  lazy val x = {
    println("Control is in X code block. This x block is not executed since its declared lazy and its not called in rest of program. If we turn the testFlag value to true, then this block will get executed and y block execution is skipped")
    //some computation
    10*10000/20+500
  }

  lazy val y = {
    println("Control is in Y code block")
    //some computation
    10*10000/20+500+200
  }

  val z = {
    println("Control is in Z code block. This block gets executed irrespective of its usage in the program, unlike x and y which are executed pnly when they are called/used since they are declared lazy")
    //some computation
    10*10000/20+500+200
  }

  val testFlag : Boolean = false

  val result = if (testFlag) {
    x
  } else {
    y
  }

}
