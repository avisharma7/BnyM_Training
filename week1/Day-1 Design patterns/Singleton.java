/*
Implementation of singleton design pattern.

-> Ensure that class has only one instance and provide a global point of access to it.

 To create singleton patterns:
1)Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
2)Private constructor: It will prevent to instantiate the Singleton class from outside the class.
3)Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.
 */
class Perficient {

    private static Perficient instance; //initialised to null


    private Perficient(){

    }
//getInstance method checks if instance is null.
//If it is, it creates a new Perficient object.
// Otherwise, it returns the existing instance.
// This ensures only one instance of Perficient is created.

    static Perficient getInstance(){
        if(instance == null){
            instance = new Perficient();
        }
        return instance;
    }

    void demo(){
        System.out.println("Hi PRFT Peeps!!!");
    }
}

public class Singleton{
    public static void main(String[] args) {
        Perficient perficient = Perficient.getInstance();
        perficient.demo();
    }
}


