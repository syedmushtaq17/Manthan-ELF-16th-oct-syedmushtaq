function validateForm(){
    let name=document.forms['loginForm']['name']
    let password=document.forms['loginForm']['password']
    let pEle=document.getElementById('pele');
    let pElee=document.getElementById('pelee');

    

    if(name.value.trim().length>5 && password.value.trim().length>5){
        pEle.style.display='none'
       pElee.style.display='none'
        return true;
    }
  

    else{

        if(name.value.trim().length<=5){
            pEle.style.display='block' 
        }
        else{
            pEle.style.display='none'
        }
        

        if(password.value.trim().length<=5){
            pElee.style.display='block'
        }
        else{
            pElee.style.display='none'
        }
        
       
       
  
        return false;
    }
}