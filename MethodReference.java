//implementation of instance method reference
//syntax: containingObject::instanceMethodName

interface test {
    void employee();
}

class MethodReference2 {
    public void saySomething() {
        System.out.println("Hi, This is an example for instance method reference:");
    }

    public static void main(String[] args) {
        // creating instance of MethodReference2
        MethodReference2 mr2 = new MethodReference2();

        // referring to non-static method / instance method using instance
        test t = mr2::saySomething;

        // calling interface method
        t.employee();
    }
}
