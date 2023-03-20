package maas;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYears;

    Employee(String name, int salary, int workHours, int hireYears){

        this.name =name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    double tax(int salary){
        if(salary < 1000)
        return 0.0;
        else
            return salary * 0.03; 
        }

    int bonus(int workHours){
        int bonuses =0;
        if(workHours > 40){
            bonuses  += (workHours - 40)*30;
        }

        return bonuses;
    }

    double raiseSalary(int hireYears){
        int now = 2023;
        double toplam = 0.0;

        int diff = now - hireYears;
        if(diff < 9)
         toplam +=5.0;
        if(diff>9 && diff <19)
         toplam +=10.0;
        if( diff > 19)
         toplam+=15.0;
        
        return toplam;
    }

    void toSstring(){
        System.out.println("Vergi: "+ tax(salary)+"\n"+
        "Bonus: "+ bonus(workHours)+"\n"+
        "maasş artışı: "+raiseSalary(hireYears)+"\n"+
        "Vergi ve bonuslar ile maaş: "+(-tax(salary)+bonus(workHours)+salary));
    }
}
