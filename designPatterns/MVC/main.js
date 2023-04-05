
function setup(){
	createCanvas(1000, 1000, WEBGL).parent("canvas")

	const model = new Model(width,height)
	const view = new View (width, height)

	model.addObserver(view)
	model.setRadius(500)
	model.setAngle(255)
	view.draw()

}
function draw(){

}
