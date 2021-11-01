public class Person
{
    // Instance Variables
    private int m_age;
    private String m_name;

    /** Default Constructor */
    Person(String name, int age)
    {
        Set(name, age);
    }

    // Getters and Setters
    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        m_age = age;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public void Set(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    // Private methods

    // Public methods
    public void SaysHello()
    {
        System.out.println(getName() + " says hello!");
    }
}
