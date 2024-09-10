// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writting something");
//     }
//     public void printColor(){
//         System.out.println(this.color);

//     }
// }

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     // Student(String name, int age){
//     //     this.name = name;
//     //     this.age = age;

//     // }
//     Student(Student s2){
//         this.name = s2.name;
//         this.age = s2.age;

//     }
//     Student(){

//     }
// }


// public class OOPS {
//     public static void main(String[] args) {
//         // Pen pen1 = new Pen();  //pen1 is nobject
//         // pen1.color = "blue";
//         // pen1.type = "gel";
//         // pen1.write();

//         // Pen pen2 = new Pen();
//         // pen2.color = "black";
//         // pen2.type = "ballpoint";
//         // pen1.printColor();
//         // pen2.printColor();

//         // Student s = new Student("sahil", 19);
//         Student s = new Student();
      
//         s.name = "sahil";
//         s.age = 19;
//         Student s2 = new Student(s);

//         s2.printInfo();
        
//     }
    
// }

//polymorphism:
// class Disciple{
//     String name;
//     int age;


//     public void printIntro(String name){
//         System.out.println(name);
//     }
    
//     public void printIntro(int age){
//         System.out.println(age);
//     }
    
//     public void printIntro(String name, int age){
//         System.out.println(name + "" + age);
//     }
// }





// public class OOPS{
//     public static void main(String[] args) {
//         Disciple d1 = new Disciple();
//         d1.name = "sahil";
//         d1.age  = 20;

//         d1.printIntro(d1.age);
        
//     }
// }


// Inheritance

class Shape{
 
    public void area(int area){
        System.out.println("display area" + area);
       
    }

  
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
       System.out.println(1/2*l*h);

    }
}
public class OOPS{
    public static void main(String[] args) {
      
       
        
        
    }
}