#[allow(overflowing_literals)]
#[allow(unused_variables)]
fn  main(){
    let _hello = "hello hello";
    let _number:usize =90;
    let _h = 0xFFF9;
    let _o = 0o7;
    let _b = 0b1000;
    enum Conti {
        AFRICA,
        ASIA,
        EUROPE,
        AMERICA,
    }
   let a = Conti :: AFRICA;
   match a {
      Conti::ASIA => println!("ASIA") ,
      Conti::EUROPE => print!("Europe"),
      Conti::AFRICA => print!("Europe"),
      Conti::AMERICA => print!("Europe"),
   } 
   
}
