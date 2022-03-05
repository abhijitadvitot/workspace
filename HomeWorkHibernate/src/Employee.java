import java.util.Objects;

public class Employee {

    private  Integer empId;
    private  String empName,mobileNo,empDesignation,empSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary='" + empSalary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(mobileNo, employee.mobileNo) && Objects.equals(empDesignation, employee.empDesignation) && Objects.equals(empSalary, employee.empSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, mobileNo, empDesignation, empSalary);
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }
}
