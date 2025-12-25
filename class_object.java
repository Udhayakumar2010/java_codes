 class rectangle{
    int length,width;
    void getdeatails(int l,int w){
        length = l;
        width = w ;
     }
     int area(){
        int a = length*width;
        return a;
     }
}



public class class_object{
    public static void main(String args[]){
        rectangle obj = new rectangle();
        obj.length = 10;
        obj.width = 20;
        System.out.println("Area of rectangle :"+obj.area());
        
    }
}