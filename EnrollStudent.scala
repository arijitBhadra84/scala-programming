trait GoodStudent {
  def doesStudy(x:Any): Boolean
  def doesPlay(x:Any): Boolean = true
}

class Student(name:String, std:Int) extends GoodStudent {
   var n:String = name
   var s:Int = std
  
   def doesStudy(x:Any) = x.asInstanceOf[Int] > 5
} 

object EnrollStudent extends App {
  val s1 = new Student("Awantik",10)
  println(s1.doesStudy(6))
}