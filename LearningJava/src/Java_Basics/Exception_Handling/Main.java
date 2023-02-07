package Java_Basics.Exception_Handling;

public class Main {
    public static void main(String[] args) {
//        int a =5;
//        int b=0;
//
//        try {divide(2,0);}
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("always execute if there is exception or not");
//        }

        try{
            String name = "aditya";
            if(name.equals("aditya")){
                throw new CustomException("name is aditya");
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }



    }
    static int divide(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("not divisible");
        }
        return a/b;
    }
}
