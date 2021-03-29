package empwages;

class Empwages{
public static final int Present = 1;
public static final int Full_Time = 1;
public static final int Part_Time = 2;


public static void main(String[] args){
System.out.println("Welcome to Employee");
        computeEmpWages("DMart",20,20,100);
	 computeEmpWages("Reliance",15,23,110);

}
public static int computeEmpWages(String company,int Wage_perhr,int Max_Workingdays,int Totalworkinghrs){
int workingdays=0;
int workinghrs=0;
int Total_Emp_hrs=0;
int Total_wage=0;
int Emp_wage=0;
int empcheck = (int) (Math.random() * 2);
switch(empcheck){
case Present:
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
return Total_wage;
}
}


