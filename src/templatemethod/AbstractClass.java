package templatemethod;

public abstract class AbstractClass {
    public final void templateMethod() {
        step1();
        step2();
        step3();
        step4();
    }

    public abstract void step1();

    public final void step2() {
        System.out.println("step 2 from the abstract class");
    }

    public abstract void step3();

    public final void step4() {
        System.out.println("step 4 from the abstract class"); 
    }
}