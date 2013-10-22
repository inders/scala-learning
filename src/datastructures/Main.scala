package datastructures

/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 11/10/13
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
object Main {

  def f(x: Int) = if (x > 2) Some(x) else None

  def isEven(x: Int): Boolean = x % 2 == 0

  def main(args: Array[String]) {

    val ds = new DataStructures
    println("tuple hostname part :" + ds.tuple._1)

    //do tuple stuff
    ds.tuple match {
      case ("localhost", "80") => println("localhost")
      case ("yahoo.com", "90") => println("yahoo")
      case(_, _) => println("any other")

    }


    //apply a function on the list i.e. multiply each entry by 2
    val mutipliedList =  ds.list.map( x => x * 2)
    println("Multiplied list " + mutipliedList)


    //return entries from list which are > 2 now
    val filteredList = mutipliedList.map(x => f(x))
    println("Filtered list > 2" + filteredList)

    //apply filter on a list
     println("Even Filtered List " + filteredList.filter(x => isEven(x.getOrElse(0))))

    //let's zip up to lists together
    filteredList.zip(ds.list)
    println("Zipped Filtered List " + filteredList)

    //find something in the list
    val value = filteredList.find(i => i.getOrElse(0) > 5)
    println("first value with values > 5" + value)

    //drop first two elements from the list
    val droppedList = filteredList.drop(2)
    println("After dropping two elements the list looks like" + droppedList)

    //let's try flatten
    val nestedList = List(1, 2, List(3,4))
    println("nested list" + nestedList)

    //let's do flatmap
    // it's a combination of map and flatten into one
    //Refernce -> http://twitter.github.io/scala_school/collections.html
    val nestedList1 = List(List(1, 2), List(3,4))

    val flatMapList = nestedList1.flatMap(x => x.map(_ * 2))
    println("nested list : " + nestedList1)
    println(" flatt mapped list : " + flatMapList)

    //let's do foldLeft



    //do map stuff
    println ("map key lookup " + ds.map.get(1))
    println ("looking up a key which i will not find " + ds.map.getOrElse(2, 0))



    //use map of functions
    val function = ds.functionMap.get("twoTimes")






  }
}
