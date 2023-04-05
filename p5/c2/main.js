let canvas = document.getElementById('c2');
let renderer = new c2.Renderer(canvas);
const width = 900;
const height = width/16*9;

renderer.size(width,height); 
renderer.background('#cccccc');

let rect = new c2.Rect(0, 0, width,height);
let rects = rect.split([1,2,3,5], 'squarify');

renderer.draw(() => {
  renderer.clear();
  
  let mouse = renderer.mouse;
  let point = new c2.Point(mouse.x, mouse.y);
  for (let rect of rects){
    if(rect.contains(point)) renderer.fill('#ff0000');
    else renderer.fill(false);
    renderer.rect(rect);
  }
});
