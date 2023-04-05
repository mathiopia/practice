class Simulate {
	writer;
	constructor(writer){
		this.writer = writer
	}
	display(){
		const s = "hello"
		this.writer.write(s)
	}
} 
class displayByConsole {
	write(s){
		console.log("displayByConsole "+s)
	}	
}
const sim = new Simulate(new displayByConsole())
sim.display()

// functional way

const simulate = writer => {
	const s = "displaying functional way "
	writer(s)	
}
const writer = s => { console.log(s) }
simulate(writer)

//or 

function Simulate2 (write){
	this.display = () =>{
		write("hello from functinal class")	
	} 
}
const sim2 = new Simulate2(writer)
sim2.display()

