/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 10/10/13
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
object  CaseClassFilter {

  //reference : http://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html
  case class Item(name : String, price : Int);

  val items = List(Item("tv", 200), Item("fridge", 300))

  def main(args: Array [String]) {

    val filteredListonCase = items.filter { case Item(name, price) => price > 200 }
    println("Filtered List based on case " + filteredListonCase)

  }

}
