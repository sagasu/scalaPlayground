package playground

trait Friend {
  val name: String
  def listen = println("I am "+ name+" your name")
}

class Human(val name: String) extends Friend
class Animal(val name: String)
class Dog(override val name: String) extends Animal(name) with Friend
class Cat(override val name: String) extends Animal(name)

class Traits{
  def seekHelp(friend: Friend) = friend.listen
  
  val peter = new Human("Peter")
  peter.listen
  seekHelp(peter)
  
  val rover = new Dog("Rover")
  rover.listen
  seekHelp(rover)
  
  val snow = new Cat("Snow") with Friend
  snow.listen
  seekHelp(snow)
}