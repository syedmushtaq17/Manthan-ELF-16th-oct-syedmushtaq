function first(anything){

   ( function(i) {setTimeout(function(){
    console.log("First function executed")
    anything();
    console.log(i)
    },1000);
})(10)


    console.log("hello")
}

function second(){
    console.log("second function executed")
}

first(second)

// we can pass function as argument to another function so that anything will be executed after
// printing first only it goes to second first prints hello

