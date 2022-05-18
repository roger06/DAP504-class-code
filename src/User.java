public class User {

    private String firstName;
    private String lastName;
    int libraryCode;

    public void showFullName() {

        System.out.println("Full name = "
                + giveFirstName() + "  "
                + getLastName()

        );
    }

    public User createUser(String type){

        if (type == "Student") {
            User user = new Student();
            return user;
        }

        if (type == "Staff") {
            User user = new Tutor();
            return user;
        }

     return null;

    }





    public String giveFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
