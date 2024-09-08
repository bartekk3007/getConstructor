import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        String className = "java.util.Random";
        Class c1 = Class.forName(className);
        Object o1 = c1.getConstructor().newInstance();
        Random r1 = (Random) o1;
        System.out.println(r1.nextInt(100));
    }
}