public class DataTypes {
    public static void main(String[] args) {
        var salary = 1000;
        //pension 3%

        var pension = salary*0.03;

        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
        
        var employeeName = "Eduardo Granados";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary );
    }
}
