public class MyClass {

    public static void main(String[] args) {
        System.out.println("Hello from MyClass ");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public void arithException(int a) {
        int b = a / 0;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public String compareLinks(){
        return "Hello";
    }
}
