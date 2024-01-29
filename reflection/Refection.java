import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        // Example class for reflection
        Class<?> clazz = MyClass.class;

        // Get class name
        System.out.println("Class Name: " + clazz.getName());

        // Get constructors
        System.out.println("Constructors:");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Get methods
        System.out.println("\nMethods:");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // Get fields
        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // Create an instance using reflection
        try {
            Object instance = clazz.getDeclaredConstructor().newInstance();
            System.out.println("\nInstance created using reflection: " + instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    private int myField;

    public MyClass() {
        this.myField = 42;
    }

    public void myMethod() {
        System.out.println("Hello from myMethod!");
    }
}
