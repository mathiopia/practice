use std::io;
fn main() {
    println!("enter your name man ");
    let mut name = String::new();
    io::stdin().read_line(&mut name).expect("faild to read line");
    println!("your name {}",name);
}
