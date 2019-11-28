const promise=new Promise(function(resolve,reject){

    if(55>10){
        resolve('Success')
    }
    else{
        reject('Error')
    }
})

promise.then(function(data){
    console.log('Data ',data)
}).catch(function(error){
    console.log('Data ',error)
})


const personData=new Promise(function(resolve,error){
    if(5>10){
        let data=[10,20,40,50]
        resolve(data)
    }else{
        error("NO data")
    }
})

personData.then(function(pdata){
    console.log(pdata)
    pdata.push(245,340)
    return pdata

}).then(function(planetData){
    
    console.log('Planet Data ',planetData)
}).catch(function(err){
    console.log('Error is ',err)
})





const employeeData=new Promise(function(resolve,reject){
    if(20>10){
        let emp=[
                {
                    name:'Shalini',
                    id:1,
                    age:24

                },
                {
                    name:'Malini',
                    id:2,
                    age:20

                },
                {name:'Rohit',
                id:3,
                age:3
                }
        ]

          resolve(emp)
    }
    else{
            reject('server Not Found')
    }

})

employeeData.then(function(empD){
    if(empD[1].name==='Malini'){
        return empD[1]
    }
}).then(function(eData){
    console.log('Employee ',eData)

}).catch(function(){
    console.log('Error')
})


//jshdjdjjdlkajsbd                  kjasxn            sdu qqqqqsuds xx
