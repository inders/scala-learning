package concurrency

/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 14/10/13
 * Time: 1:54 AM
 * To change this template use File | Settings | File Templates.
 */
object Concurrency {


  class thread extends Runnable {
    def run() {
      println (" I am in a thread")
    }

  }

  def main(args: Array[String]) = {
    val t = new Thread(new thread)
    t.start()

  }
}
