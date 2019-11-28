// var brands=['kinley','bisleri','kingfisher','balaji']

// brands.forEach(function(value,index){
//     console.log("brand = ",value  ,"and index is ",index)
// })

// var hobbies=['catching','sleeping','jumping','numismatics']
//  var h=hobbies.push('music')
//  console.log('h is ',h)

// console.log("after push ", hobbies)

//  var x=hobbies.pop();
// console.log('afetr pop ', hobbies)
// console.log(x)

// var l=hobbies.unshift('hello')
// console.log("after unshift ", hobbies)
// console.log(l)


//  var x=hobbies.shift();
// console.log('afetr shift ', hobbies)
// console.log(x)

// var hj=hobbies.join('+')
// console.log(hobbies,' dsdu',hj)

// var x=hobbies.splice(2,0,'mine')
// console.log(hobbies,'splice ',x)

// var hh=hobbies.slice(0,3)
// console.log('slice ',hh)
// console.log(hobbies)

var number=[100,200,300]

var newnumber=number.filter(function(value,index){

    if(value>100)
    return true;
    else
    return false;

})

var ne = number.filter(value=> value>100)


console.log("filtered using arrow numbers ", ne)
console.log(number)




var newww = number.map(function(valu,index){
    var val=valu+50
    return val;
})


console.log("Mapped using normal numbers ", newww)
console.log(number)



var neww = number.map(value=> value+50)


console.log("Mapped using arrow numbers ", neww)
console.log(number)
