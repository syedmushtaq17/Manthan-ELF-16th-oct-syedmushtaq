var person =
{
    firstname:"Syed",
    lastname:"Mushtaq",
    age:21,
    gender:'M',
    eat:function(){
  console.log("Eating Biryani")
    },
    getFullName : function(){
        return this.firstname +" "+ this .lastname
    }

};
var fname=person.firstname;
var lname=person.lastname;
var age=person.age;
var gender=person.gender;
person.eat();
 var fullname= person.getFullName();
 console.log("first Name is ",fname)
 console.log("Last Name is "+lname)
 console.log("Age is "+age)
 console.log("Gender is "+gender)
 console.log("Full name is "+fullname)
 