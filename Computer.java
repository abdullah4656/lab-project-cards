public class Computer {
    String computernumber;
    String lcdmodel;
    int ramsize;
    int hddsize;
    boolean hasgpu;

    public int getRamsize() {
        return ramsize;
    }

    public int getHddsize() {
        return hddsize;
    }

    public String getLcdmodel() {
        return lcdmodel;
    }

    public String getComputernumber() {
        return computernumber;
    }

    public boolean isHasgpu() {
        return hasgpu;
    }

    public void setLcdmodel(String lcdmodel) {
        this.lcdmodel = lcdmodel;
    }

    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }

    public void setHddsize(int hddsize) {
        this.hddsize = hddsize;
    }

    public void setHasgpu(boolean hasgpu) {
        this.hasgpu = hasgpu;
    }

    public void setComputernumber(String computernumber) {
        this.computernumber = computernumber;
    }

    public boolean equals() {
        if (hasgpu) {
            return true;
        } else {
            return false;
        }
    }

    public Computer(String computernumber, String lcdmodel, int ramsize, int hddsize, boolean hasgpu) {
        this.computernumber = computernumber;
        this.lcdmodel = lcdmodel;
        this.ramsize = ramsize;
        this.hddsize = hddsize;
        this.hasgpu = hasgpu;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Computer computer = (Computer) obj;

        if (ramsize != computer.ramsize) return false;
        if (hddsize != computer.hddsize) return false;
        if (hasgpu != computer.hasgpu) return false;
        if (!computernumber.equals(computer.computernumber)) return false;
        return lcdmodel.equals(computer.lcdmodel);
    }
    public Computer clone(){
        return new Computer(computernumber,ramsize,lcdmodel,hasgpu,hddsize);
    }
//    public String toString(){
//        return String.format("%s %s %s %s",)
//    }
}


