class Model {
	hight
	width
	radius
	angle
	observers = []
	constructor (width,hight){
		this.hight = hight
		this.width = width
	}
	addObserver(observer){
		this.observers.push(observer)
	}
	removeObserver(observer){
		const i = this.observers.indexOf(observer)
		if(i == -1 )
			return "this observer is not added as observer " 
		else
			this.observers.splice(i,1) ;
	}
	//notify observers
	notifyAngle(value){
		const notify = o => o.update(
			{angle:value, radius:this.radius}
		)	
		this.observers.forEach(notify)
	}
	notifyRadius(value){
		const notify = o => o.update(
			{angle:this.angle, radius:value}
		)	
		this.observers.forEach(notify)
	}

	//setting values
	setRadius(value){
		this.radius = value 
		this.notifyRadius(value)
	}
	setAngle(value){
		this.angle = value 
		this.notifyAngle(value)
	}
}

