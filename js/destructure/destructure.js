let person={
    name:'Shalini',
    age:20,
    hobbies:['singing','dancing']
}
let { name,hobbies}=person;
console.log("Hobbies ",hobbies)

console.log('=======================================')
displayname(name)
function displayname(name){
    console.log(name)
  
}


let hob=['singing','dance','eat']
let [h1,h2]=hobbies
console.log(h1)
console.log(h2)




let items=[
            {
                id:1,
                name:'bag',
                price:400
            },
            {
                id:2,
                name:'watch',
                price:500
            }
]

console.log('Items ',items)
items[0].id=5;
console.log('after modify ',items)
items[0].name='syed'
var p={...items[0]}
console.log(p)

let add={
    city:'bangalore'
}
let pp={...add,...items}
console.log(pp)

var a=[1,2,2,3,4]
var b=[7,8,9]
var ab={...a,...b}
console.log(ab)

function sum(...args){
    let value=0;
    for(let i=0;i<args.length;i++){
        value+=args[i]
    }
    console.log(value)
}

var aa=[10,20,30]
sum(aa)

sum(10,20,30) 