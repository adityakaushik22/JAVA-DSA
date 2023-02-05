package Java_Basics.Properties_oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l+" "+ box.b+" "+ box.h);

        BoxWeight b1 = new BoxWeight();
        System.out.println(b1.h+" "+b1.weight);

        BoxWeight b2 = new BoxWeight(1,2,3,4);

//        Box b3 = new BoxWeight(2,1,5,4);
//        System.out.println(b3.weight); cannot access the weight because the reference variable determines what values it can access and not the object(here boxweight is object made) so box can't access weight as a parent so that  why its not possible to access this

        BoxWeight b3 = new BoxWeight(b2);
        System.out.println(b3.l+" "+ b3.b+" "+ b3.h+" "+ b3.weight);

        BoxPrice b4 =new BoxPrice(1,2,3,4,5);
        BoxPrice b5 = new BoxPrice(b4);
        BoxPrice B6 =new BoxPrice(1,2,3); // so in this constructor we're able to use the properties of box, boxweight and cost property opf itself so multilevel inheritance.
    }
}
