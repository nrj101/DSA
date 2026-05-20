package day8;

public class Student {
    int rollNo;
    String name;

    Student(String nm, int rN){
        rollNo = rN;
        name = nm;
    }

    public int getRollNo(){
        return rollNo;
    }


    public void displayInfo(){
        System.out.printf("\nName: %s   \nRoll No. : %d   \n", name, rollNo);
    }

    @Override
    public String toString(){
        return "{Name: "+name+", Roll No. :"+rollNo+"}";
    }


}
