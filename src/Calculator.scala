/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 10/10/13
 * Time: 10:36 PM
 * To change this template use File | Settings | File Templates.
 */
class Calculator(brand: String) {

  val color : String = if (brand == "TI" ) {
    "blue"
  } else {
    "white"
  }

  def add(i: Int, j: Int): Int = i +j
}
