class Person {
    private String name; // Private variable

    // Getter method to retrieve the 'name' attribute
    public String getName() {
        return name;
    }

    // Setter method to set the 'name' attribute
    public void setName(String newName) {
        name = newName;
    }
}

public class rect {
    public static void main(String[] args) {
        Person person = new Person();

        // Using the setter method to set the 'name' attribute
        person.setName("John");

        // Using the getter method to retrieve the 'name' attribute
        String retrievedName = person.getName();

        System.out.println("Name: " + retrievedName);
    }
}
