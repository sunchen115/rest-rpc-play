import org.specs2.mutable.Specification

class PlayerSpec extends Specification {
  "getFullName" should {
    "return name" in {
      val player = new Player("sc",2)
      player.getFullInfo must beEqualTo("sc")
    }

  }

  "getHelloMessage" should {
      "return message in Hello" in {
        val player = new Player("sc",2)
        player.getHelloMessage must beEqualTo("This is core")
      }

    }

  "getHelloPlugin" should {
      "return message in plugin" in {
        val player = new Player("sc",2)
        player.getHelloHaxeMessage must beEqualTo("Hello")
      }
  }
}