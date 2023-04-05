#include <iostream>
using std::string;

class Person {
	// it is an abstract class because of the key word virtual
	virtual void introduce()=0;
};
class Student: Person{
	private:
		string Name;
		string Section;
		int Age;
	public:
		Student (string name, int age, string section){
			Name = name;
			Age = age;
			Section = section;
		}
		void introduce (){
			std::cout<< "Name: " << Name << std::endl;
			std::cout<< "Age: " << Age << std::endl;
			std::cout<<	"Section: " << Section << std::endl ;
		}
};

int main(){
	Student student = Student("Fitsum", 21, "B");
	student.introduce();
}
