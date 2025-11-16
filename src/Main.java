import Builder.User;
import Singelton.SingeltonDemo;

public class Main {
    public static void main(String[] args)
    {

        // Simple example of using the Singleton
        SingeltonDemo instance = SingeltonDemo.getInstance();

        // Simple example of using the Builder
        User user = User.newBuilder("user1@java.com", "user1")
                .setAge(25)
                .build();
    }
}
