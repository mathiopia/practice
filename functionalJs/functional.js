// function add(x,y){
//   return x+y
// }

// assigning variables to a function 
const adder = function (x,y){
  return x+n
}
// give a function as a input 
function multiply(x,y,add){
  let result= 0
  for (let i = 0; i < y; i++) {
    result = adder(x, result);
  }
  return result
}
// console.log(multiply(3,34,add))
// returning function 
function multiplyBy(x){
  return function (y) {
    return x * y;
  };
}
const multiplyBy3 = multiplyBy(3);
// console.log( multiplyBy3(4) )

// what to not do
// use loops use if and switches
// instead use ternary operation
//  condition ? "if true": "if false"
// use forEach ,reduce and filter
//

const arr = [1, 2, 3, 4, 5, 6];
// instead of using loops

// const output = (item) => console.log(item);
// arr.forEach(output, arr);

//purity
// as in no side effects
const add = (x, y) => x + y;
// impure
const add2 = (x, y) => {
  // console.log(x + y); // observable side effect
  return x + y;
};

// Immutableness
const person = {
  firstName: "fitsum",
};
// const only protect the variable person not the object as a whole
person.lastName = "wondessen";
// console.log(person);
// so we use Object freeze function to wrap it up
const person2 = Object.freeze({
  firstName: "fitsum",
});
person2.lastName = "wondessen";
// console.log(person2); // not mutated by the above line
//another example is arr
const index = Object.freeze([1, 2, 3, 4, 5, 6]);
// index.push(2) can't be done
// so what can we do about it
//    we can copy it
const addOnArr = (arr, next) => {
  const added = Object.freeze([...arr, next]);
  return added;
};
const index2 = addOnArr(index, 7);

const obj = { value:10 }
const obj2 = { value:12	}
const obj3 = { value:13	}
// closure
const valueAccumlator = () =>{
	let value = []
return obj => {
		if (obj) value.push(obj.value) 
		else return value
	}
}
const accumlate = valueAccumlator() // have access to variable value even if the function above is closed
accumlate(obj)
accumlate(obj3)
accumlate(obj2)
// console.log(accumlate())

//recursive algorithim

const gcd = (a,b) =>{
	if( b==0 ) 
		return a
	else 
		return gcd(b, a%b)
} 
// console.log(gcd(24,9))

const merge = (arr1,arr2) => arr1.concat(arr2)
const array1 = [20,67,2,4,5,6]
const array2 = [1,4,9,4,0,6]

const mergeSort = arr =>{
	if (arr.length < 2) return arr // base condition
	else
	{
		const middle = Math.floor(arr.length/2)
		const left   = mergeSort(arr.slice(0,middle))
		const right  = mergeSort(arr.slice(middle))
		return merge(left,right)
	}
}

 
