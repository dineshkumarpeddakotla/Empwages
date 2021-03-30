package empwages;

class Empwages{
public static final int Present = 1;
public static final int Full_Time = 1;
public static final int Part_Time = 2;
private  final String company;
private  final int Wage_perhr;
private  final int Max_Workingdays;
private  final int Totalworkinghrs;
private  int Total_wage;

public Empwages(String company,int Wage_perhr,int Max_Workingdays,int Totalworkinghrs){
this.company=company;
this.Wage_perhr=Wage_perhr;
this.Max_Workingdays=Max_Workingdays;
this.Totalworkinghrs=Totalworkinghrs;
}
public String toString(){
return ("Total Emp Wage for Company : "+company+" is : "+Total_wage);
}

public static void main(String[] args){
System.out.println("Welcome to Employee");
Empwages dMart = new Empwages("DMart",20,20,100);
Empwages reliance= new Empwages("Reliance",15,23,110);
System.out.println("DMart");
        dMart.computeEmpWages();
System.out.println("reliance");

	 reliance.computeEmpWages();

}

public void computeEmpWages(){
int workingdays=0;
int workinghrs=0;
int Total_Emp_hrs=0;
Total_wage=0;
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
}
}


