// Databricks notebook source
val list: List[Any] = List(
"a string",
100,
'x',
  true,
  () => "Junk Function"
)

// COMMAND ----------

// f = x => println(x) -> x is a function that takes one argument & prints it
def fun(x:Any): Unit = println(x)

//list.foreach(x => println(x))
list.foreach(fun)

// COMMAND ----------

val funclist: List[()=>String] = List( ()=>"Hello", ()=>"World", ()=>"Again")

// COMMAND ----------

funclist.foreach(x=> println(x()))

// COMMAND ----------

val funclist: List[Any] = List( ()=>"Hello", ()=>"World", ()=>"Again")

// COMMAND ----------

//Call function corresponding to the obect for 0th element
val f = funclist(0) 

// COMMAND ----------

val g:Any = 9
//println(g + g) g is of type Any, + operator is not defined for Any
val f = g.asInstanceOf[Integer]

// COMMAND ----------

// funclist.foreach(x => println(x())) - this will not work because each x is not a function rather an object of type Any
funclist.foreach(x => println( x.asInstanceOf[()=>String]()))

// COMMAND ----------


