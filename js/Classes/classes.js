class Person{
      
 constructor(name,age){
     this.name=name;
     
     this.age=age;
 }
   getAge(){
       return this.age;
   }
   getName(){
       return this.name;
   }

  

}
const person1=new Person('Daniel',61)
const person2=new Person('de Niro',74)
console.log(person1.name)
let pName=person2.getName()
console.log('Name  is ',pName)
let page=person2.getAge()
console.log('Age is ',page)



class Teacher extends Person{
                constructor(name,age,subject){
                    super(name,age)
                    this.subject=subject
                }
             getSubject(){
                    return this.subject
                }
            


}

const t1=new Teacher('vikas',27,['j2ee','Java','JSP'])
console.log(t1)
console.log(t1.getName())


console.log(t1.getSubject())