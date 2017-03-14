// Databricks notebook source
val f = (x:Int) => x + 1

// COMMAND ----------

f(7)

// COMMAND ----------

val g = () => 100

// COMMAND ----------

g()

// COMMAND ----------

//Methods
def add(x:Int,y:Int): Int = x + y
add(13,24)

// COMMAND ----------

class FullName( firstname:String, lastname:String){
  def name(): String = firstname + lastname
}

// COMMAND ----------

val fullname = new FullName("Awantik","Das")

// COMMAND ----------

fullname.name()

// COMMAND ----------

case class Point(x:Int, y:Int)

// COMMAND ----------

//You can instanciate case classes without new keyword
//case classes are immutable
//Compared by value
val point = Point(1,2)
val anotherPoint = Point(1,2)


// COMMAND ----------

point == anotherPoint

// COMMAND ----------

val new_fullname = new FullName("Awantik","Das")

// COMMAND ----------

//Since normal classes are compared by address
fullname == new_fullname

// COMMAND ----------

//Objects
//They are single instances of their own defination
//Singleton of their own classes
//Define obect using object keyword

object Factory{
  private var ctr = 0
  def construct(): Int = {
    ctr += 1
    ctr // No need to write return, automatically return ctr
  }
}


// COMMAND ----------

val newCtr = Factory.construct()
println(newCtr)

// COMMAND ----------

val newCtr2 = Factory.construct()
println(newCtr2)

// COMMAND ----------

//Traits are types containing certain fields & methods
trait GreatWall{
  def great(name:String): Unit
}

// COMMAND ----------

trait DefaultGreatWall{
  def great(name:String): Unit =
     println("This is default print")
}

// COMMAND ----------

class MyGreatWall extends DefaultGreatWall

// COMMAND ----------

class NewGreatWall extends GreatWall{
  def great(name:String): Unit =
     println("This is NewGreatWall print")
}

// COMMAND ----------

val ngw = new NewGreatWall()

// COMMAND ----------

ngw.great("6 feet")

// COMMAND ----------


