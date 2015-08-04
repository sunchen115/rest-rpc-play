import org.specs2.mutable.Specification

class PlayerSpec extends Specification {
  "getFullName" should {
    "return name" in {
      val player = new Player("sc",2)
      player.getFullInfo must beEqualTo("sc")
    }

  }
}