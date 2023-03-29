package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class SquareRootTest extends AnyFunSuite {
  val squareRootObject = new SquareRoot
  test("To test for negative numbers") {
    val list = List(-9)
    val expectedResult = squareRootObject.squareRootOfNumbers(list)
    assert(expectedResult.size === 1)
    assert(expectedResult(0).isNaN)
  }
  test("To test for positive numbers") {
    val list = List(4, 9, 16, 25)
    val expectedResult = List(2.0, 3.0, 4.0, 5.0)
    assert(squareRootObject.squareRootOfNumbers(list) === expectedResult)
  }
  test("To test for empty list") {
    val list = List()
    val expectedResult = List()
    assert(squareRootObject.squareRootOfNumbers(list) === expectedResult)
  }
}
