package tutorial4

object HelloWorld extends  App {

  println("Hi Santosh")

  println("My commandline arguments are added to projects Edit->Run configurations->ProgramArguments: ")
  println(args.mkString(", "))
}
