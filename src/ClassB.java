public class ClassB implements InterfaceA, InterfaceB{
    @Override
    public void hello() {
        InterfaceA.super.hello();
    }
}
