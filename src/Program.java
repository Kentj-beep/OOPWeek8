public class Program
{

    public static float square(float value)
    {
        return value * value;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        float valueToSquare = 5;

        float valueSquared = square(valueToSquare);

        System.out.println("The Squared Value is: " + valueSquared);

        Person person = new Person("Jacob", 23);
        person.SaysHello();
    }
}
