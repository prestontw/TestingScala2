package com.example.preston.testingscala2

object test {

  implicit def hello(implicit n: Int): Int = {
    n * 4
  }

}
