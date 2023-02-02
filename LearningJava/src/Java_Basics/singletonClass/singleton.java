package Java_Basics.singletonClass;

public class singleton {
    // made private constructor so new objects are not created on initialisation.
    private singleton(){

    }
    // created a varaiable of singleton type for checking if the obj is created or not so named instance;
    private static singleton instance;

//    by this method we will check if the instance is null or not if null we'll create object so in the starting the no object is there so for first time it will create. if not it will return the created object so point to singleton object.
    public static singleton getInstance(){
        //  check if the instance is null so we can create object. so if its null only then only we can create object.
        if(instance==null) instance=new singleton();
        return instance;
    }
}
