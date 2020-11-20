public class AboutMe
{

    AboutMe()
    {

    }

    public static void main(String[] args)
    {

        System.out.println("Hello there!");
        AboutMe h = new AboutMe();

        System.out.println("My name is " + h.myName() + ", and I attend " + h.mySchool() + ". I am " + h.myAge() +" years old");
    }

    String myName()
    {
        return "Zenith";
    }

    String mySchool()
    {
        return "Classified";
    }

    int myAge()
    {
        return 420;
    }
}
