package concurrency

/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 14/10/13
 * Time: 1:59 AM
 * To change this template use File | Settings | File Templates.
 */

import java.net.{ServerSocket, Socket}
import java.util.concurrent.{Executors, ExecutorService}


//make the server run in a this thread
class SampleServer(port: Int, poolSize: Int) extends Runnable{
  def run() {
    val pool = Executors.newFixedThreadPool(poolSize)

    val serverSocket = new ServerSocket(port)
    //run the server infinitely
    while(true) {
      val socket = serverSocket.accept()
      //handle the accepted message in a seperate thread
      pool.execute(new Handler(socket))
    }
  }


class Handler(s: Socket) extends  Runnable{
  def run() {
    //read message from the socket
    //testing synchronized also

    s.getOutputStream.write(Thread.currentThread().getName().toString.getBytes)
    s.getOutputStream.close()
    }
  }





}
