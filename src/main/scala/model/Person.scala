package org.knoldus.main.model

import org.knoldus.main.repo.Person


object Person {
  def main(args: Array[String]): Unit = {
    val person = new Person("Manmeet",21)
    val person1 = new Person("Singh",65)
    val person2 = new Person("Vipul",22)
    val person3 = new Person("Karan",65)
    val person4 = new Person("Rakesh",69)
    val person5 = new Person("Hii",24)
    val person6 = new Person("Hello",25)
    val person7 = new Person("TestAgain",25)
    println( person < person1 )  //true
    println( person1 < person2 ) //true
    println( person2 < person3 ) //true
    println( person3 < person4 ) //true
    println( person4 < person5 ) //false
    println( person5 < person6 ) //true
    println( person7 < person6 ) //false
  }
}