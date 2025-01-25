package encapsulationandpolymorphism.employeemanagementsystem;

abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setBaseSalary( baseSalary);

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary>=0) this.baseSalary = baseSalary;
        else System.out.println("Enter salary in positive integer");
    }

    abstract void calculateSalary();
     public void displayDetails(){
         System.out.println("Name : "+name+"\nId : "+employeeId+"\nSalary : "+baseSalary+"\nDepartment is "+department);
     }
    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("The department is "+getDepartment());
    }
}
