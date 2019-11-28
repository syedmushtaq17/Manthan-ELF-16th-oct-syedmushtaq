var date = new Date()
// console.log("Todays date is ",date);
// var date1=new Date(0)
// console.log("Milliseconds date is ",date1);
// var date2=new Date("October 30")
// console.log("String date is ",date2);
// var date3=new Date(1990,15,4)
// console.log("Dat eyear month constructor date is ",date3);

var year=date.getFullYear();
console.log("Year ",year)
var min=date.getMinutes()
console.log("Min  ",min)
var mon=date.getMonth()
console.log("Mon  ",mon)
var day=date.getDay()
console.log("dAy",day)
var tdate=date.getDate()
console.log("Date  ",tdate)

var month=["Jan","feb","March","April",'may','june','july','august','september','october','November','december']
var da=['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday']
console.log("Mnoth is ",month[mon])
console.log("Day is ",da[day])


console.log("--------------------------------------------------")
var rand=Math.ceil(Math.random()*6)
console.log(rand)

var age=12
var ter=(age>18) ?"Adult":"Child"
console.log(ter)

