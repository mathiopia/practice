
fn main(){
    // let s = String :: from("String");
    // string literal does not have a fixed size so can not be passed around so we convert it to
    // String object which have a fixed size we can work with
    // as_str changes to str
    let s = "hello";
    print(s.to_string());
    print1(&s);//passing by reference 
}

fn print(input_string:String){
    println!("{}",input_string);
}
// it borrows the reference to the string literal
fn print1(input_string:&str){
    println!("this is works by using by borrowing {}",input_string)
}

//arrays
fn arrays(){
    let int_arr: [i32; 3] = [1, 2, 3];
    for i in int_arr.iter() {
        println!("{}",i);
    }
}
//vectors
fn vectors(){
    let str_vec: Vec<&str> = vec!["one", "two", "three"];
    for i in str_vec.iter() {
        println!("{}",i);
    }
}

fn is_even(i:i32) -> i32{
    if (i&1) != 0{
        1
    }
    else {
        0
    }
}

fn factorial(num:u64) ->u64{
    match num {
       0 => 1,
       1 => 1,
       _ => factorial(num-1)*num
    }
}

