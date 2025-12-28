class shapeRectangle{
    private int length, width;
    int getlength()//getter Method
    {
        return length;
    }
    int getwidth()
    {
        return width;
    }
    //setter method
    void setlength(int l)
    {
        if(l>0){
            length =l;
        }
        else
           length=0;

    }
    void setwidth(int w )
    {
        width = w;
    }
  int area(){
    int a = length*width;
    return a;
  }

}
public class get_set {
        public static void main(String args[]){
            shapeRectangle obj = new shapeRectangle();
            obj.setlength(10);
            obj.setwidth(20);
            System.out.println("length: "+ obj.getlength());
            System.out.println("width: "+ obj.getwidth());
            System.out.println("area of rectangle: "+ obj.area());
        }

    }
    