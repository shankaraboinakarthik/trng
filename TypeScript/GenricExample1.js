function getArray(items) {
    return new Array().concat(items);
}
var myNumArr12 = getArray12([100, 200, 400]);
var myStrArr12 = getArray12(["Hello", "World"]);
myNumArr12.push(400); //ok
myStrArr12.push("Hello TypeScript"); //ok
myNumArr12.push("hi"); //compiler error
myStrArr12.push(400); //compiler error
console.log(myNumArr12);
console.log(myStrArr12);
