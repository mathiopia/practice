class Controller {
	button
	models=[]
	constructor(model){
		this.button= createButton("val").parent("button")
		this.addModel(model)
	}
	addModel(m){
		this.models.push(m)
	}
	removeModel(m){
		const i = this.models.indexOf(m)
		if(i == -1 )
			return "there is no models called "+m
		else 
			this.models.splice(i,1)
	}
	notify (value){
		const notifys = m => m.setRadius(value)
		this.models.forEach(notifys)
	}

}
