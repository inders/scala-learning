package datastructures

/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 11/10/13
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
class DataStructures {

  val list = List(1,2,3,4,1)
  val set = Set(1,2,3,4)
  //a tuple can also be written as 1->2 or in this case hostname -> port
  val tuple = ("hostname", "port")

  val map = Map(1 -> 2)
  val stringMap = Map("foo" -> "bar")
  //expands into Map((1, "one"), (2, "two")) with the first element being the key and the second being the value of the Map.
  val tupleMap = Map(1 -> "one", 2 -> "two")

  //map within a map
  val mapInMap = Map(1 -> Map("foo"  -> "bar"))

  //map of functions
  val functionMap = Map ("twoTimes" -> {twoTimes(_)})

  def twoTimes(i: Int): Int = {
    i * 2
  }

}
