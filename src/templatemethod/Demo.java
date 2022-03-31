package templatemethod;

public class Demo {
    public static void main(String[] args) {
        AbstractClass c1 = new ConcreteClass1();
        AbstractClass c2 = new ConcreteClass2();
        c1.templateMethod();
        c2.templateMethod();
    }
}
