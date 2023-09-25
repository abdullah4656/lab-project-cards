
public class Singer {
    private  String name;
    private String gender;
   private String nationality;
    Date debutyear;
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Singer(String name, String gender, String nationality, Date debutyear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutyear = debutyear;
    }

    public void setDebutyear(Date debutyear) {
        this.debutyear = debutyear;
    }

    public Date getDebutyear() {
        return debutyear;
    }

    public String getNationality() {
        return nationality;
    }
public String toString(){

        return String.format("%s %s %s %s",name,gender,nationality,debutyear);
}



}
