//declare variables
// var has variable scope to the nearest function
function doSomething() {
  for (var i = 0; i <= 5; i++) {
    console.log(i);
  }
  console.log("finally: " + i);
}
doSomething();
