/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 13/10/13
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
object FunctionComposition {


  def f(s: String) = "f(" + s + ")"

  def g(g: String) = "g(" + g + ")"

  //partial functions
  val one: PartialFunction[Int, String] = {case 1 => "one"}
  val two: PartialFunction[Int, String] = {case 2 => "two"}
  val three: PartialFunction[Int, String] = {case 1 => "three"}
  val wildcard: PartialFunction[Int, String] = {case _ => "anything else"}

  val composedPartial = one orElse(two).orElse(three).orElse(wildcard)


  def main(args: Array [String]) {
    val composeFunction = f _ compose(g)

    println("Compose output " + composeFunction("abc"))

    //test whether partial function is defined at this
    println("Partial function is defined :" + one.isDefinedAt(1))
    println("Partial function is not defined :" + one.isDefinedAt(2))

    //calling a partial function
    if (one.isDefinedAt(1))  {
      val value = one(1);
      println("Value from partial function :" + value
      )
    }

    //test calling the composed partial function
    val composedPartialVal = composedPartial(2);
    println("Composed Partial Val : " + composedPartialVal)

    //test composedPartial with wildcard value
    val composedPartialVal1 = composedPartial(5)
    println("Composed Partial Val1 : " + composedPartialVal1)

  }
}
