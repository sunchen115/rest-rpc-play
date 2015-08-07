/**
 * Created by csun on 8/4/15.
 */
class Player(name: String, age: Int) {
  def getFullInfo: String = {
    return name
  }

  def getHelloMessage: String = {
    return MyCore.getCoreMessage
  }

  def getHelloHaxeMessage: String = {
    return new core.Hello().getMessage()
  }
}
