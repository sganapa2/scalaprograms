package udemy

object CaseClassExample extends App {

  val personObj: Person =  Person("santosh", 30)
  personObj.age

  val normalPerson: NormalPersonClass =  NormalPersonClass("normal class", 3)
 normalPerson.age
}

case class Person(name: String, age: Int)

//companion object is by default created by case class with apply factory method as below
/*
object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
}
*/

class NormalPersonClass(val name: String, val age: Int)

object  NormalPersonClass {
  def apply(name: String, age: Int): NormalPersonClass = new NormalPersonClass(name, age)
}