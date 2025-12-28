class student{
    int roll_no;
    String name;

    student(int r, String n){
        this.roll_no = r;
        this.name = n;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll_no :"+roll_no);
        System.out.println("-----------------------");
    }
}


public class array_object {
    public static void main(String[] args) {
        student [] obj = new student[5];
    
        obj[0] = new student(01,"udhaya");
        obj[1] = new student(02,"kumar");
        obj[2] = new student(03,"vasanth");
        obj[3] = new student(04,"kumar");
        for(int i=0;i<obj.length;i++){
            obj[i].display();
        }
    }
}
