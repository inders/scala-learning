/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 10/10/13
 * Time: 10:50 PM
 * To change this template use File | Settings | File Templates.
 */
class ScientificCalculator(brand: String) extends Calculator(brand){

  def log(m: Double, n : Double): Double = Math.log(m) / Math.log(n)
}
