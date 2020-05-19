package udemy

object  AbstractClassExample extends App {

  val dog = new Dog
  println(s"Does dog can fly? => ${dog.canFly}")
}

sealed abstract  class AnimalAbstract {
  def canFly : Boolean
}

sealed class Dog extends AnimalAbstract {
  override def canFly: Boolean = false
}