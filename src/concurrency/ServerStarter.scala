package concurrency

/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 14/10/13
 * Time: 2:13 AM
 * To change this template use File | Settings | File Templates.
 */
object ServerStarter {

  def main(args: Array [String]) {
    //test the client by using command - nc localhost 2020
    val server = new Thread(new SampleServer(2020, 5))
    server.start()
  }

}
