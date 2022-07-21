const show = () => "Hello"

console.log(show())

const total = (a,b) => a+b
const values =[45,55]
console.log('total:='+total(...values))

let list1=[400,450,500]
let list2=[550,600,650]

const combine = (list1,list2) =>{
    let combine = [...list1,...list2];
    return combine;
}

console.log(combine(list1,list2));

let employee = {id:101, employeeName:"Parveen", salary: 30000};

const destru1 = (obj) => {
    let {id,salary} = obj;
    console.log(id +','+ salary);
}

destru1(employee);

const destru2 = (obj) => {
    let {id, ...others} = obj;
    console.log(id);
    console.log(others);
}

destru2(employee);