public class methodsDemo {
    static int age = 50;

    //Defination of static method
    public static  void staticPrintAge(){
        System.out.println("Static Method");
        System.out.println(age);
    }

    //Instance Methods
    public void instancePrinitAge(){
        System.out.println("Instance Method");
        System.out.println(age);
    }
    public static void main(String[] args) {
        staticPrintAge(); //calling static method
        //instancePrinitAge(); to call instance method we have to create the obj;
        methodsDemo meDemo = new methodsDemo();
        meDemo.instancePrinitAge();
    }
}
