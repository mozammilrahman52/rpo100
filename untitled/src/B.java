public class B {
    private static B b;
    private B(){

    }
    public static B getB(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
