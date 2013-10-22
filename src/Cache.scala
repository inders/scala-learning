/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 10/10/13
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
trait Cache[K, V] {

  def get(key : K): V
  def put (key : K, value : V)
  def delete(key : K)

}
