#![allow(unused_variables)]

fn main(){
    let mut s1 = String::from("hello");
    let s2 = s1.clone();
    let s3 = &mut s1;
    s3.push(';');
    // println!("this is s3{}",s3);
    // println!("this is s1 {} this is s2 {}",s1,s2);
    append_dot(&mut s1);
    let mut  n:i64 =3;
    add_one(&mut n);
    println!("{}",n );
    println!("{:?}",swapper());
}
fn append_dot(st :&mut String){
    st.push('.');
}
fn add_one(t :&mut i64){
    *t = *t+1 
}
fn swapper()-> Vec<String>{
    let mut words = vec![String :: from("one"), String :: from("two"), String :: from("three")];
    let t = words[0].clone();
    words[0] = words[1].clone();
    words[1] = t;
    words
}
