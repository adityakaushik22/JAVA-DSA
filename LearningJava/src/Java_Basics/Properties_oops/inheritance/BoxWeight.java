package Java_Basics.Properties_oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=-1;
        this.h=1;
    }
    BoxWeight(BoxWeight other){
        super(other); // since we have a constructor in parent class that takes a constructor.
        weight= other.weight;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); // so it hust calls the parent class constructor to get the values of l,b,h from the parent class to this class. so its just bringing the properties from there to here.
        // used to initialise values present in parent class.
        this.weight = weight;

        // super : to call the constructor above it. also can be used as this keyword for the above class. so basically if we want to explicitly use the parent class properties/ data members we can use super.l or whatever to access it.
        // the child class cares about its parent functions/properties so thats why it says to parent to initialise yourself first thats why super is called first
    }

    BoxWeight(double side ,double weight){
        super(side);
        this.weight=weight;
    }
}
