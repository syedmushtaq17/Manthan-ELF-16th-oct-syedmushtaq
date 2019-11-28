var hobbies=['Sleeping','Eating','Travelling','','Coding','Trekking']
for(let i=0;i<hobbies.length;i++){
    console.log(hobbies[i])
}

console.log("===========================================================")
for(var hobby of hobbies){
    console.log(hobby)
}
console.log("var is ",hobby)
console.log("===========================================================")
for( var hobby in hobbies)
{
    console.log(hobbies [hobby])
}
console.log("var is ",hobby)

console.log("===========================================================")
var employee={
    name:'syed',
    age:21,
    color:'fair',
    phone_no:974645646947,
    hobbies:['Sleeping','Eating','Travelling','','Coding','Trekking']
}
console.log(employee["age"])

console.log("===========================================================")
for(var i in employee){
    console.log(employee[i])
}
console.log("===========================================================")
console.log(employee.hobbies[4])