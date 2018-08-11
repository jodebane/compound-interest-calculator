
  var year = 0;
var initcash = 1000.0f;


  var interestrate = 0.25f;

  
  var goal = 100000.0f;

var current = initcash;


  

  
def truthyes(goal:Float, current:Float):Boolean={
    val truth = (current>goal)
    return truth;
  }
  


println(truthyes(goal, current))

while(truthyes(goal, current)==false){
  year = year + 1
  current=(current*(1+interestrate))
  println(year, current)
  
}
