public class Main {
    public static void main(String[] args) {
        linky num1 = new linky(4);

        linky num2 = new linky(3);

        num1.setnext(num2);

        System.out.println(num1);
        System.out.println(num1.getnext());
    }
}