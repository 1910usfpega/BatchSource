var a = 10;
console.log(a);
a = "chaos";
console.log(a);
var b, c, d, e, f, g, h, e;
b = "10";
c = true;
d = {}; //object
e = null;
g = (0/0);
h = []; //array
i = function(){};
/* Datatypes
    primitives
        number
        string
        undefined
        symbol
        null
        boolean
            true or false
            ALSO have truthy falsy
                Falsy
                    0
                    undefined
                    null
                    false
                    ""
                    NaN
                Truthy
                    true
                    1
                    everything that isn't falsy
                    Object
    Objects

*/
//Type coersion
//console.log(5==5);
//console.log(5=="5");
//console.log(5==="5");
/*
console.log("Tests:");
console.log(false == 1);
console.log(false == 0);
console.log(true==1);
console.log(true==10);
console.log(false==12);
console.log("5"!==5); //the opposite of ===
*/

//Objects in JS
//property-value pairs

//Object literal
var person = {
    "name" : "Jimmy",
    age : 74
};

person.numOfFeet=2;

//Constructor
function Human(name,age){
    this.name = name;
    this.age = age;
}

//Maker Functions
function makeHuman(name,age){
    var h = {};
    h.name = name;
    h.age = age;
    return h;
}

//Another Maker Function
function makeHoomin(name,age){
    var p = {
        "name":name,
        "age":age
    }
    return p;
}

//Array - []
var arr = [10,20,30];
arr[9] = 5;
arr[1000] = "Why" // Semicolon injection

//Functions - 3 Invocations

//Function Form - "this" refers to the global object
//
function divideByZero(kitty,kat){
    console.log("Hey kitty kitty");
    return (kitty + kat);
}

//Constructor Form - "this" refers to the object being created
//How to use - var x = conFunc(2,5);
//Then show/enter x
var conFunc = function(a,b){
    return a*b;
}

//Method Form - "this" refers to person
person.getInfo = function(){
    return this.age;
}

//No Overloading in JS!
crazy = function(at, least, three){
    console.log(at);
    console.log(least);
    console.log(three);
    console.log(arguments[5]);
}

/*Scopes
    Function Scope
        Things that are declared in a function.
        Use the "var" keyword. If you leave out "var", you'll create an implicit global.
        Accessible only inside the function.
    Global Scope
        Declared outside of any function.
        Accessible anywhere.
    Shadowing
        If multiple variables have the same name, JS will use the one that was declared most recently.
            Variable name clashes are bad.
            Difficult to debug and test.
        "let" does not escape blocks, "var" does.
    Hoisting
        Moves declaration to top of scope
            WATCH OUT!!!
    Implicit Globals
        Variables declared in functional scope without the “var” keyword
            Unless you’re in strict mode
        Generally, stay away from using globals.
    Closure
        An inner function that has access to the outer function's variable (scope chain)
        Closure mimics encapsulation
        (Using a function within a function to mimic encapsulation)
        Has 3 Scope Chains:
            1) It has access to its own scope (variables defined between its curly braces)
            2) It has access to the outter fuction's variables
            3) It has access to the global variables
*/

var add = function(){
    var count = 0;
    return function(){
        count += 1;
        return count;
    }
}();




