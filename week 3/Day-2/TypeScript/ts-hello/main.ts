//declare variables
// var has variable scope to the nearest function

function dosomething() {
  for (var i = 0; i <= 5; i++) {
    console.log(i);
  }
  console.log("finally: " + i);
}
dosomething();
