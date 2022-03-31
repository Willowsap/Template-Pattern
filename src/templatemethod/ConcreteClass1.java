package templatemethod;

public class ConcreteClass1 extends AbstractClass {

    @Override
    public void step1() {
        System.out.println("step 1 from concrete class 1");
    }

    @Override
    public void step3() {
        System.out.println("step 3 from concrete class 1");
    }
}
