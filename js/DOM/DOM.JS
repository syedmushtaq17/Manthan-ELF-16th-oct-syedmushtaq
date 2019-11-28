// var pElement =document.getElementById('demo');
// console.log(pElement);
// var text =pElement.textContent;
// console.log('Text of p', text)
// pElement.textContent='Good Evening'
// var modifiedText=pElement.textContent;
// console.log("modified text ",modifiedText)


var pElement=document.querySelector('p');
pElement.textContent='Good Evening'
var elements=document.getElementsByClassName('test')
elements[0].style.color='red'
pElement.style.fontSize='40px'
pElement.style.color='green'
console.log('Elements ',elements)

var qElements =document.querySelectorAll('.test');
// (function(){
//     setInterval(function(){
// console.log('hello',qElements),
// qElements[0].style.color='blue',
// qElements[0].style.fontSize='50px'
// document.write('helllllo')
//     }
// ,10000);
// }
// )();


var bel=document.createElement('button')
bel.textContent='Click Me   !!!1'
document.body.appendChild(bel)


var bell=document.createElement('p')
bell.textContent='dont   !!!1'
document.body.appendChild(bell)

 var ele=document.getElementById('add');



 ele.classList='add'

 