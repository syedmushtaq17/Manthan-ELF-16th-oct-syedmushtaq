

  function getdata(){
    fetch('https://jsonplaceholder.typicode.com/todos')
    .then(response => response.json())
    .then(function(res){
        
        let ui =  `<ul>
        ${
                res.forEach(function(val){
                    `<li>${val.title}</li>
                    <li>${val.id}</li>`
            })
        }
            </ul>`
        document.getElementById("de").innerHTML = ui
            
    }
    )
    .catch(err=>console.log(err))
  
  }