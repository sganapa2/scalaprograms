package udemy

object OptionExample extends App {

  val lst = List(1,2,3)

  val str: String = "null"
  val strNull: String = null

  /*val isNumberExist(number: Int) : Option[Int,Nothing] => number match {
    case x =>
  }*/

  val strLength = str match {
    case x:String => x.length
    case _ => println(s"String is null")
  }

println(s"$strLength")
  println(s"$strNull")


  val str3 : Option[String] = None
  val str4 : Option[String] = Some("Santosh")

  println(str3.getOrElse("Nothing....string str3 is not initialised"))

  println(str4.getOrElse("Nothing....string str4 is not initialised"))

  //Udemy example
  case class User(name: String, age: Int, gender: Option[String]) // Gender is optional here

  val testMap = Map("US" -> "UnitedStates", "UK"->"United Kingdom")

  println(testMap.get("US"))
  println(testMap.get("ASIA"))
}
