public class Lab{
    String labid;
    Computer[] computer;
    LabStatus status;
    Employe labattendent;

    public String getLabid() {
        return labid;
    }

    public void setLabid(String labid) {
        this.labid = labid;
    }

    public Computer[] getComputer() {
        return computer;
    }

    public void setComputer(Computer[] computer) {
        this.computer = computer;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employe getLabattendent() {
        return labattendent;
    }

    public void setLabattendent(Employe labattendent) {
        this.labattendent = labattendent;
    }

    public Lab(String labid, Computer[] computer, LabStatus status, Employe labattendent) {
        this.labid = labid;
        this.computer = computer;
        this.status = status;
        this.labattendent = labattendent;
    }

    public static void main(String[] args) {


        // Create Computer objects
        Computer[] computers1 = {new Computer("107", "Dell", 8, 128, false)};
        Computer[] computers2 = {new Computer("108", "HP", 16, 256, true)};

        // Create Lab attendants
        Employe labAttendant1 = new Employe("Lab101", "Ali", "Lab Attendant");
        Employe labAttendant2 = new Employe("Lab102", "Ahmed", "Lab Attendant");

        // Create Lab objects
        Lab lab1 = new Lab("Lab101", computers1, LabStatus.OPERATIONAL, labAttendant1);
        Lab lab2 = new Lab("Lab102", computers2, LabStatus.OPERATIONAL, labAttendant2);

        // Print lab details
        System.out.println("Lab 1 details:");
        System.out.println(lab1.getLabid());
        //System.out.println(.toString(lab1.getComputer()));
        System.out.println(lab1.getStatus());
        System.out.println(lab1.getLabattendent());

        System.out.println("\nLab 2 details:");
        System.out.println(lab2.getLabid());
        //System.out.println(Arrays.toString(lab2.getComputer()));
        System.out.println(lab2.getStatus());
        System.out.println(lab2.getLabattendent());


    }
}