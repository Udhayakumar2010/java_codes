//copy constructor in java is a special type of constructor  used to create new object by copying the field values of an existing object of same class
class complex{
    //this feild access private modifier
    private int real,img;

    public complex(){
        //"this" keyword represent can be current class
        this.real=5;
        this.img=3;
    }

    public complex(int r, int j){
        this.real =r;
        this.img = j;
    }
    //copy constructor
    public complex(complex obj2){
        this.real = obj2.real;
        this.img = obj2.img;
    }
    //convert to  string
  public String toString(){
    return "(" +real + "+" + img +  "i)";
  }

}
public class copy_con {
    public static void main(String[] args) {
        complex obj1 = new complex();
        System.out.println("object1 "+obj1);
        complex obj2 = new complex(7,3);
        System.out.println("object2 "+ obj2);
        complex obj3 = new complex(obj2);
        System.out.println("object03" +obj3);
    }
}
