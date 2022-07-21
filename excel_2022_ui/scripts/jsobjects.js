// function itsMe(){
//     console.log('Hi');
// }

var myobj={}

myobj.itsMe=function(){
    console.log('Hi');
}

myobj.author='Parveen'

var ourObj={
    designer:'Using JS Object',
    showDesigner: function(){
        console.log(this.designer)
        return this.designer;
    }
}

var Employee = function(employeeId, employeeName){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
}

var parveen = new Employee(101, 'Parveen');

function setContent(){
    var element = document.getElementById('author');
    element.innerHTML = myobj.author;

    var title = document.getElementById("heading");
    title.innerHTML = ourObj.designer;
}