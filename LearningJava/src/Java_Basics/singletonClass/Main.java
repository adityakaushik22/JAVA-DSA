package Java_Basics.singletonClass;

public class Main {
    public static void main(String[] args) {
//        singleton s= new singleton(); so will give error as our constructor is private thats why we made a function that returns class.
        singleton s = singleton.getInstance(); // .getinstance will check if the instance is null so its null intinally so will create object and return it. after that the objects we create will go through the check from get instance so they will check if instance is null but its now so it will return the old instance that we created basically refer to that object only so no new object.
        singleton q =singleton.getInstance();

        // both s and q will point to one single object.
    }
}
