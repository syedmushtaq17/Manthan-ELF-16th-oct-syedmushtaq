console.log("=====Named Function======")
add(10,20)
function add(num1,num2){
    var sum=num1+num2
    console.log(sum)
}


console.log("===Anonymous Function=")

var x=function(num1,num2){
    var pro=num1*num2
    console.log(pro)
}

x(10,10)
console.log("=====Self Invoked Function");

(function(num1,num2){
    var sub=num1-num2
    console.log(sub)
})(20,10);



console.log("===Arrow functions")
console.log("arrow function is",ar(3))
var ar=i=>i*i


    
