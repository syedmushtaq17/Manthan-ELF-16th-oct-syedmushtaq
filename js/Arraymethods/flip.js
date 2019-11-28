var items=[{
    name:"Lipstick",
    id:1,
    price:499
},
{
 name:"eye liner",
 id:2,
 price:999
},
{
    name:"watch",
    id:3,
    price:10000
},
{
    name:"trimmer",
    id:4,
    price:500,

}

]


var filter=items.filter(item=>item.price>500)

console.log("Filetred items ",filter)




  var map= items.map(item=>{
     var i={
         name:item.name,
         price:item.price+100,
         id:item.id
     }
     return i;
 })
console.log( "Mapped elements ",map)
console.log(items)

var chocolates=["dairy milk",'dark chocolates','feraro']
var haskachha=chocolates.includes("kaccha mango bite")
console.log("has kaccha ", haskachha)

var isarr=Array.isArray(chocolates)
console.log('is array ',isarr)
