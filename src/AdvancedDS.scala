/**
 * Created with IntelliJ IDEA.
 * User: inderbir.singh
 * Date: 13/10/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class AdvancedDS {

  //Splits a collection into two halves based on a predicate function
  def groupBy [K] (f: (_) => K) : Map[K, Traversable[_]]


  def partition (p: (_) ⇒ Boolean) : (Traversable[_], Traversable[_])

  def filter (p: (_) => Boolean) : Traversable[_]




}
