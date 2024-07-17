//implementation of instance method reference
//syntax: containingObject::instanceMethodName

interface perficient{
    void employee();
}
 class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hi, This is an example for instance method reference: ");
    }
    public static void main(String [] args){

        //creating instance of MethodReference2
        InstanceMethodReference imr =  new InstanceMethodReference();

        //referring to non static method / instance method
        perficient per = imr::saySomething;

        //calling interface method
        per.employee();

    }

}
