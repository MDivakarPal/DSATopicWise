import java.util.*;
class Student 
{
    int marks;
    String name;
    Student(int marks, String name)
    {
        this.name=name;
        this.marks=marks;
    }

    public int compareTo(Student obj)
    {
        if(this.marks>obj.marks)
        return 1;
        else if(this.marks<obj.marks)
        return -1;
        else
        return 0;
    }

    String getName()
    {
        return name;
    }

    String getMarks()
    {
        return marks;
    }

    public String toString()
    {
        return "Student ["+marks+" , "+name+" ]";
    }
}

class Test{
    public static void main(String[] args) {
        Student [] st=new Student[10];
        st[0]=new Student(50,"Divakar Pal");
        st[1]=new Student(23,"Brajesh Kumar");
        st[2]=new Student(96,"Sehdev Kumar");
        st[3]=new Student(25,"Akash Chaturvedi");
        st[4]=new Student(0,"Uday");
        st[5]=new Student(9,"Ankit");
        st[6]=new Student(99,"Surabhi");
        st[7]=new Student(45,"Priyanka");
        st[8]=new Student(36,"Faisal");
        st[9]=new Student(52,"Sagar");
        Arrays.sort(st,Comparator.comparing(Student::getName()));
      //  st.forEach(System.out::println);
      for(int i=0;i<10;i++)
      {
          System.out.println(st[i].toString());
      }
    }
}