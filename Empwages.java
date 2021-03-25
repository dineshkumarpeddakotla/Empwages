package empwages;

class Empwages{
public static final int Present = 1;
public static final int Full_Time = 1;
public static final int Part_Time = 2;
public static final int Wage_perhr=20;
public static void main(String[] args){

System.out.println("Welcome to Employee");
 Empwage emp = new Empwage();
        emp.Emp_wage();
}
public static class Empwage {
public void Emp_wage() {
int empcheck = (int) (Math.random() * 2);
int emphrs=0;
if(empcheck==Present){
System.out.println("Employee is Present");
int checkfullpart = ((int) (Math.random() * 2));
if(checkfullpart==Full_Time){
emphrs=8;
}
if(checkfullpart==Part_Time){
 emphrs=4;
}
int Daily_wage=Wage_perhr*emphrs;

System.out.println("Daily Emp Wage =" +Daily_wage);
}else{
System.out.println("Employee is Absent");
}
}
}
}

