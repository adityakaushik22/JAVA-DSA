package Java_Basics.Enums;

public class Basic{
    enum Week implements A{
        Monday , Tuesday ,Wednesday, Thursday, Friday, Saturday, Sunday;

        // these are enum constraints
        // public , static , final by default
        // since its final you cannot create child enums.
        // type is week
        Week(){
            System.out.println("constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("hello im enum");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

//        for(Week DAY: Week.values()){
//            System.out.println(DAY);
//        }

        // ordinal() methods tells the position of the enum here our week has monday so its position is 0
//        System.out.println(week.ordinal());
    }
}
