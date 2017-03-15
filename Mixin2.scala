trait Tail {
    def wagTail { println("tail is wagging") }
    def stopTail { println("tail is stopped") }
}

abstract class Pet (var name: String) {
    def speak // abstract
    def ownerIsHome { println("excited") }
    def jumpForJoy { println("jumping for joy") }
}

class Dog (name: String) extends Pet (name) with Tail {
    def speak { println("woof") }
    override def ownerIsHome {
        wagTail
        speak
    }
}

object Test extends App {
    val zeus = new Dog("Zeus")
    zeus.ownerIsHome
    zeus.jumpForJoy
}