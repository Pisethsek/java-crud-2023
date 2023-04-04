package makingAnnotation;

public class Application {
    public static void main(String[] args) {
        AppleProduct obj = new AppleProduct(1001, "13 pro", 2023, new AppleBluetooth());

        Class<?> clazz = obj.getClass();
        if (clazz.isAnnotationPresent(SmartPhone.class)){
            System.out.println("It is the group of smartphone.");
        }

        System.out.println(obj);
        
    }
}
