public class Employe {
    String Employeeid;
    String name;
    String designation="Lab Attendent";

    public void setEmployeeid(String employeeid) {
        Employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employe(String employeeid, String name, String designation) {
        Employeeid = employeeid;
        this.name = name;
        this.designation = designation;
    }

    public String getEmployeeid() {
        return Employeeid;
    }
}
