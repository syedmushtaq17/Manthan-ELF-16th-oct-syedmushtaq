const person={
                name:'Sundari',
                age:33,
                weight:60,
                hobbies:['Music','Singing']
}


// to send
const JSONobject =JSON.stringify( person);
console.log(JSONobject)

//to receive
const JSObject=JSON.parse(JSONobject)
console.log('hello',JSObject)
console.log('hello','hi')