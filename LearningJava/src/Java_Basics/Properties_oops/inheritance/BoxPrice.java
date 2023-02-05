package Java_Basics.Properties_oops.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super(); // can access the boxweight default constructor.
        this.cost=-1;
    }

    BoxPrice(BoxPrice old){
        super(old);
        this.cost= old.cost;
    }

    public BoxPrice(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }

    BoxPrice(double side,double weight,double cost){
        super(side, weight);
        this.cost=cost;
    }
}
