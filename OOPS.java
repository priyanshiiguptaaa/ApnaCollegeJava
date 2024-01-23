// OBJECT - real world entities 
/* CLASSES - collection os these entities 
           - conatins both data members (attributes) and member functions
*/

//Example
/*public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student(); // objects are created in heap
        s1.name = "priyanshi";
        s1.marks = 99;
        int per = s1.percentage(98, 96, 99);
        System.out.println(s1.name + s1.marks + per);
    }
}
*/

class Student {
    String name;
    int marks;

    int percentage(int phy, int chem, int maths) {
        int result = phy + chem + maths;
        return result;
    }
}

/*
 * ACCESS SPECIFIERS
 * Acess Modifier - within class - within package - outside package by subclass
 * only - outside package
 * PRIVATE - Y - N - N - N
 * DEFAULT - Y - Y - N - N
 * PROTECTED - Y - Y - Y - N
 * PUBLIC - Y - Y - Y - Y
 */

/*
 * GETTERS AND SETTERS
 * GET - to return the value
 * SET - to change the value
 * THIS KEYWORD - is used to refer to the current value
 */

/*
 * ENCAPSULATION
 * wrapping up of data in a single capsule
 * involves data hiding using access specifiers
 */

/*
 * CONSTRUCTORS
 * data member with the name of class
 * gets called automatically when an object is created
 * memory allocation
 * dont have a return type
 * can have access specifiers
 * * TYPES OF CONSTRUCTORS
 * parameterized constructor
 * default constructor
 * copy constructor
 * do nothing constructor
 * CONSTRUCTOR OVERLOADING (polymorphism)
 */

class TypesOfConstructor {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "Priyanshi";
        s.roll = 42;
        s.password = "abcd";
        Student2 s2 = new Student2(s);
        s2.password = "xyz";
    }
}

class Student2 {
    String name;
    int roll;
    String password;

    // copy constructor
    Student2(Student2 s) {
        this.name = s.name;
        this.roll = s.roll;
    }

    // default constructor
    Student2() {
        System.out.println("The default constructor is called....");
    }

    // parameterized constructors
    Student2(String name) {
        this.name = name;
    }

    Student2(int roll) {
        this.roll = roll;
    }
}

/*
 * SHALLOW COPY - changes reflect
 * DEEP COPY - changes dont reflect
 */
class CopyConstructorsType {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.name = "Priyanshi";
        s.roll = 42;
        s.password = "abcd";
        s.marks = new int[] { 98, 95, 97 }; // Initialize marks array
        Student3 s2 = new Student3(s);
        s2.password = "xyz";
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student3 {
    String name;
    int roll;
    String password;
    int marks[];

    // deep copy constructor
    Student3(Student3 s) {
        this.name = s.name;
        this.roll = s.roll;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    // default constructor
    Student3() {
        System.out.println("The default constructor is called....");
    }
}

/*
 * LAZY COPY
 * delaying the loading of an object until one needs - lazy loading.
 * delaying the process of instantiating the class until required.
 * important in a scenario where the cost of creating objects is high, or usage
 * of the object is rare in the program.
 * enhances the efficiency of the program.
 */

/*
 * DESTRUCTORS - destroys constructor
 * but this is not used in java bcuz of GARBAGE COLLECTOR technique (deletes the
 * object if it is not used later in the program)
 */

/*
 * INHERITANCE
 * when one class(derived / child / subclass) derives the properties(data
 * members and member functions) from another class(base / parent / superclass)
 */
class Inheritance {
    public static void main(String[] args) {
        Fishes f = new Fishes();
        f.color = "pink";
        f.fins = 4;
        f.eat();
        f.breathe();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// hybrid inheritance
class Fishes extends Animal { // single inheritance
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Dolphin extends Fishes { // Multi-level inheritance
    int num;
}

class Mammals extends Animal { // Heirarchial inheritance
    int legs;
}

/*
 * TYPES OF INHERITANCE
 * Single level
 * Multi level
 * Hybrid - multiple types of inheritances
 * Multiple
 * Heirarchial - one class is inhertied by mmultiple classes
 */

/*
 * POLYMORPHISM
 * POLY - many
 * MORPHISM - forms
 */

/*
 * TYPES OF POLYMORPHISM
 * Compile time / static / early - method overloading
 * Run time / dyanmic / late - method overrriding
 */

/*
 * METHOD OVERLOADING
 * when the same function name is used with different number or types of
 * parameters
 * FUNCTION OVERLOADING
 * CONSTRCUTOR OVERLOADING
 */

/*
 * METHOD OVERRIDING
 * parent and child classes both contain the same function but with a different
 * definition
 */
class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

abstract class Animals { // cannot create objects of abstarct
    Animals() { // can create constructor of abstract
        String color = "brown"; // gives by default brown colour to all animals
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk(); // can be defined in derived classes - abstraction
}

class Horse extends Animals {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animals {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

/*
 * CONSTRCUTOR HEIRARCHY
 * When an object of a child class is made first the constructor of parent class
 * is made then constructor of child class.
 */

/*
 * INTERFACES - blueprint of a class
 * implements multiple inheritance
 * to achieve total abstraction
 * keyword inerface
 * inherit using implements (for class extends)
 * by default all methods are abstract , public and without implementation
 * variables are final , public and static
 */

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right , diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right , diagonal , one step");
    }
}
/*
 * public class OOPS {
 * public static void main(String[] args) {
 * Queen q = new Queen();
 * q.moves();
 * }
 * }
 */

// MULTIPLE INHERITANCE
interface Herbivores {
    void eats();
}

interface Carnivores {
    void moves();
}

class Bear implements Herbivores, Carnivores {
    public void eats() {
        System.out.println("eats grass");
    }

    public void moves() {
        System.out.println("moves");
    }
}
/*
 * public class OOPS {
 * public static void main(String[] args) {
 * Bear b = new Bear();
 * b.eats();
 * b.moves();
 * }
 * }
 */

/*
 * STATIC KEYWORD - share the same variable or method of a given class
 * functions - example is main fuction everytime
 * blocks
 * properties - code below
 * nested classes
 */

class Stud {
    String name;
    int roll;
    static String school;

    void setName() { // SETTER
        this.name = name;
    }

    String getName() { // GETTER
        return this.name;
    }
}
/*
 * public class OOPS {
 * public static void main(String[] args) {
 * Stud s = new Stud();
 * s.school = "mams"; // once defined for one object gets defined for all
 * Stud s1 = new Stud();
 * System.out.println(s1.school);
 * Stud s2 = new Stud();
 * s2.school = "kdps"; // once changed for one gets changed for all
 * System.out.println(s.school);
 * System.out.println(s1.school);
 * }
 * }
 */

/*
 * SUPER KEYWORD
 * refer to immediate parent class object
 * used to access parents properties
 * used to access parents functions
 * used to access parents constructors
 */

class Animall {
    Animall() {
        System.out.println("This is an animal");
    }
}

class Horses extends Animall {
    Horses() {
        super(); // default java calls it
        System.out.println("This is a horse");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horses h = new Horses();
    }
}

/*
 * CONSTRUCTOR CHAINING
 * a constructor is called from another constructor in the same class
 * occurs through inheritance.
 * When an instance of a derived class,all constructors of base class first
 * invoked,then constructor of derived class invoked.
 * using this() keyword
 * using super() keyword
 */

/*
 * NOTES
 * a class can never be private or protected in java
 * private - default - protected - public
 * class - N - Y - N - Y
 * nested class - Y - Y - Y - Y
 * constructor - Y - Y - Y - Y
 * method - Y - Y - Y - Y
 * fields - Y - Y - Y - Y
 * Parent reference = child object
 * eg - Animal a = new Horse();
 * but opposite will lead to rruntime error
 * Aggregation and Composition is not a concept of java
 */
