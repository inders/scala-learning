/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 10/10/13
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
object Learning1 {

  def captializeAll(args: String*) {
    args.map {
      arg => arg.capitalize
    }
  }


  def main(args: Array[String]) {
    captializeAll("inder", "news")
    println("Hello world")

    //calculator
    val calc = new Calculator("hp")
    println(calc.add(1, 2))
    println("calculator color :" + calc.color)

    //lets run the extended scientific calculator
    val sCalc = new ScientificCalculator("ti")
    println("Log from scientific calc " + sCalc.log(5, 4))

    //using abstract class
    val shape = new Circle(3)
    println("Area of a circle" + shape.getArea())

    //example of function used a class
    println("Example of function being trait = " + ExampleOfFunction(1))

    //example of using case classes
    //Reference : http://twitter.github.io/scala_school/basics2.html
/*
    val case1 = new CaseClass("hp", "white")
    val case2 = new CaseClass("ti", "blue")
    println ("Negative Testing case classes" + case1 == case2)
    val case3 = new CaseClass("hp", "white")
    println("Positive Testing case classes" + case1 == case3)
*/
  }
}
