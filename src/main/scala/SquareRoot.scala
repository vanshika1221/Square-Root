package com.knoldus
import scala.util.{Try, Success, Failure}

class SquareRoot {
  def squareRootOfNumbers(inputList: List[Int]): List[Double] = {
    // Map each element in the input list to its square root
    val newList = inputList.map(element =>
      // If an exception occur then return NaN
      Try(math.sqrt(element)) match {
        case Success(element) => element
        case Failure(_) => Double.NaN
      }
    )
    newList
  }
}
