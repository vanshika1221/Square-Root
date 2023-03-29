package com.knoldus

object Driver extends App {
  val inputNumber: List[Int] = List(4, 9, 16, 25)
  val squareRootObject = new SquareRoot
  println(squareRootObject.squareRootOfNumbers(inputNumber))
}