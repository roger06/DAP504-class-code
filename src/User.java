public class User {

    private String firstName;
    public String lastName;
    int libraryCode;



    public void showFullName() {

        System.out.println("Full name = "
                + getFirstName() + "  "
                + lastName

        );
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
