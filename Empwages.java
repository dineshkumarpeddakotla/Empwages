package empwages;

class Empwages{
public static final int Present = 1;
public static void main(String[] args){
System.out.println("Welcome to Employee");
 Empwage emp = new Empwage();
        emp.Emp_wage();
}
public static class Empwage {
public void Emp_wage() {
int empcheck = (int) (Math.random() * 2);
if(empcheck==Present){
System.out.println("Employee is Present");
}else{
System.out.println("Employee is Absent");
}
}
}
}

