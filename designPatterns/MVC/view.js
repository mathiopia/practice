class View {
	radius ;
	angle ; 
	width; height;
	constructor(width, height){
		this.width= width
		this.height= height
	}
	draw(){
		box()
	}
	update(values){
		this.angle = values.angle 	
		this.radius = values.radius 	
	}
	style(){
		
	}
}
