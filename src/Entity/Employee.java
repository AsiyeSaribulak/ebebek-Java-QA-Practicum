package Entity;

public class Employee {
    private String name;
    private float salary;
    private int workHourse;
    private int hireYear;


    public Employee(String name, float salary, int workHourse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHourse = workHourse;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkHourse() {
        return workHourse;
    }

    public void setWorkHourse(int workHourse) {
        this.workHourse = workHourse;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    public float tax(float salary) {
         if (salary < 1000) {
            return 0;
        } else {
             float vergi= (float) (salary * 0.03);
          return vergi;
        }

    }


    public int bonus(int workHourse) {
        if (workHourse<=40) {
            return 0;
        }
        else {
            workHourse=(workHourse-40)+30;
            return workHourse;
        }


    }

    public float raiseSalary(int hireYear) {
         hireYear = 2021-hireYear;
         salary=(salary-tax(salary)+bonus(workHourse));
         if(hireYear<10){
             return (float) (salary*0.05);
         }
         else if (hireYear>9 && hireYear<20){
             return (float) (salary*0.1);
         } else if (hireYear>19) {
             return (float) (salary*0.15);
         } else {
             return 0;
         }


    }

    public float VergiVeBonuslarlaMaas(){
        float salary = (getSalary()-tax(getSalary())+bonus(getWorkHourse()));
       return salary;
    }
    public float ToplamMaas(){
        float total=(getSalary()+ bonus(getWorkHourse()));
        return total;
    }

    public void tostring(){
        System.out.println("çalışanın adı ve soyadı : " +getName());
        System.out.println("çalışanın maaşı : " + getSalary() + "$");
        System.out.println("çalışanın haftalık çalışma saati : " + getWorkHourse());
        System.out.println("çalışanın işe başlangıç yılı : " + getHireYear());

    }

}
