//constructor is nothing but same class name &function name and default value can be assinges interger can be zero//
class rectangle{
    int length,width;
    //same class name in method and parameterized constructor
public  rectangle(int l, int w){
    System.out.println("this is constructer method");
    length = l;
    width = w;
}

    int area(){
        int a = length*width;
        return a;
    }
}
public class constructor {
    public static void main(String args[]){
        rectangle obj = new rectangle(2,3);
        
        System.out.println("Area of rectangle "+ obj.area());
    }
}
