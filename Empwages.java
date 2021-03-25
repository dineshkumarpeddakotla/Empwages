package empwages;

class Empwages{
public static final int Present = 1;
public static final int Full_Time = 1;
public static final int Part_Time = 2;
public static final int Wage_perhr=20;
public static final int Max_Workingdays=20;
public static final int Totalworkinghrs=100;
public static void main(String[] args){
System.out.println("Welcome to Employee");
 Empwage emp = new Empwage();
        emp.Emp_wage();
}
public static class Empwage {

int workingdays=0;
int workinghrs=0;
int Total_Emp_hrs=0;

public void Emp_wage() {
int empcheck = (int) (Math.random() * 2);
switch(empcheck){
case Present:
 int Total_wage = 0;
 int Emp_wage;
while (workingdays < Max_Workingdays&&Total_Emp_hrs<Totalworkinghrs) {
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
workingdays++;
Emp_wage = emphrs * Wage_perhr;
Total_Emp_hrs += emphrs;
Total_wage += Emp_wage;
 }
   System.out.println("Total Employee Wage"+Total_wage);
break;
case 0:
System.out.println("Employee is Absent");
}
}
}
}

