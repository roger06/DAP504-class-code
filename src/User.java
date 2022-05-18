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
