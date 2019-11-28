
var pEle=document.createElement('p')


function greet(str){

    
    let name="syed mushtaq"
    // alert(str+name)
    alert(`${str} ${name}`)
    console.log(`${2+2}`);// prints 4
    console.log("2+2")//prints 2+2
    
}

function changeFont(){
  let element=    document.getElementById('test');
  element.style.fontSize="50px"
}
function retain(){
    let element=    document.getElementById('test');
    element.style.fontSize="25px"
                          
}
function showData(){
    let n=document.getElementById('up').innerText;
    console.log('Number of key presed are key pressed ',n)


}
function showElement(){

    
    pEle.textContent='Ctreated Element'
    pEle.textContent='  second'
    document.body.appendChild(pEle)
}

let el=document.getElementById('tes')
// el.onclick=function(){
//     alert('clicked')
// }

el.addEventListener('click',function(){
 alert('ccccccccccccccccllllllllllllicked')
})