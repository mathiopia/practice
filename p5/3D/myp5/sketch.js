function setup() {
  createCanvas(windowWidth, windowHeight, WEBGL)
}

function draw() {
  background(255)
  fill(0) 
  rotateX(PI)
  torus(100,25)
  
}
