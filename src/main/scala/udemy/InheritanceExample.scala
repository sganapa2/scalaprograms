package udemy

object InheritanceExample extends App {


  val cat = new Cat(4)
  println(cat.catCanFly)

  val bird = new Bird(2)
  println(s"Bird can fly ${bird.canFly}")
}

class Animal(val numberOfLegs : Int) {

  //private def canFly : Boolean = false
  protected def canFly : Boolean = false
}

class Cat(noOfLegs : Int) extends Animal(noOfLegs) {

  def catCanFly: Boolean = {
    canFly
  }
}

class Bird(val noOfLegs: Int) extends Animal(noOfLegs) {
  override  def canFly: Boolean = true
}

// trying to extend sealed class in another file
/*
class SealedClassExtendsExample extends AnimalAbstract {
}*/
