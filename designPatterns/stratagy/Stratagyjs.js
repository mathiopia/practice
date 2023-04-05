function main(){
  const gameChar = new Character() 
  gameChar.setChar(new Queen())
  gameChar.fight()
  console.log(gameChar.getWeapon())
  gameChar.setWeapon(new Gun())
  console.log(gameChar.getWeapon())
}

function Character(){
  this.char=""
  this.weapon=""
  
  this.setChar = char => {
    this.char = char
  }
  this.fight = () =>{
    return this.char.fight()
  }
}
function Queen(){
  this.weapon = new Weapon(new Sword) 

  this.fight = () => {
    console.log("i fight like a queen")
  }
}

function Weapon( weapon ){
  this.weapon = weapon;
  this.setWeapon = weapon => {
    this.weapon = weapon
  } 
  this.getWeapon = () => {
    return this.weapon
  }
}

function Sword () {
  this.weapon = "Sword"
  this.killPershot = 3
}
function Gun() {
  this.weapon = "gun"
  this.killPershot = 10
}

main()
