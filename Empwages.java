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
switch(empcheck){
case Present:
System.out.println("Employee is Present");
int checkfullpart = ((int) (Math.random() * 2));
int emphrs=0;
switch(checkfullpart){
case Full_Time:
emphrs=8;
break;
case Part_Time:
 emphrs=4;
break;
default:
}
int Daily_wage=Wage_perhr*emphrs;

System.out.println("Daily Emp Wage =" +Daily_wage);
break;
case 0:
System.out.println("Employee is Absent");
}
}
}
}

