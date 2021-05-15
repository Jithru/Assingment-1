object Q3 extends App{
  def find_cost(count:Double):Double=if (count>=50) 3*50+(count-50)*0.75+24.95 else 3*count+24.95;
  println("The total cost is = "+find_cost(60));

}
