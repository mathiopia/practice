const R = require("ramda");

const Greeting = (salute, name) => salute+" "+ name;
// console.log(Greeting("hello","fitsum"));

// +++++++++++++++++++++++++++++++++++++++

const Greeting2 = salute => name => salute+" "+ name;
const hello = Greeting2("hello");
// console.log(hello("fitsum"))

// =======================================

const Greeting3 = R.curry(Greeting);


const person = Object.freeze({
  name:"fitsum",
  lastName:"wondessen"

})
// console.log(
//   R.map(
//     x =>x.toUpperCase(),
//     person
//   )
// )
// console.log(
//   R.addIndex(R.map)(
//     (val,ind) => val +": "+ind,
//     [1,2,3,4,5]
//   )
// )

const arr = [1,2,3,4,5]
const Add2 = R.adjust(1,R.add(2),arr)
console.log(Add2)

console.log(
  R.filter(
    x => R.allPass([
      R.gte(R.__,3),
      R.lte(R.__,4)
    ])(x),
    arr
  )
)
const initalArray = x => Array(x).fill(0);
const n_build = x => f =>R.map(f, initalArray(x) );
// console.log(
//   n_build(5)(x=>"hi")
// )
const cats = Object.freeze(
  {
    name:"kitty",
    Age:3,
    howManyCats:10
  }
);
// console.log(
//   R.ap(
//     R.pipe(
//       R.prop("name"),
//       R.repeat
//     ),
//     R.prop("howManyCats")
//   )(cats)
// );
console.log(
  R.aperture(1, [1,2,3,4])
)

