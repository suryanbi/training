function simple(){

    console.log("Hello from Simple Function")

}

function simpleWithArg(name){
    console.log(name);
}

function simpleWithReturn(name){
    if(name==null){
    return 'Hello Parveen';
}else{
    return 'Hello Guest'
}
}

function invoke(name){
    console.log(simpleWithReturn(name));
}

function simpleWithFunctionAsArg(funRef){
    console.log(funRef);
    var result=funRef();
    console.log(result);
}

callFunc = function(){
    //simpleWithFunctionAsArg(simpleWithReturn('auto'));  its print the function return type

    simpleWithFunctionAsArg(simpleWithReturn);   // its print the function
}

var global_a=100   // "var" (call outside) its a global variable (access another function also)
function sum(){       //"var" (call inside) its a local variable (can't access another function)-
    local_c=300;      //-(access only this function)
    var local_b=200
}

function display(){
    sum();
    console.log(global_a);
    //console.log(local_b);
    console.log(local_c);
}