public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    // using hashCode from class String
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } 
        if (getClass() != other.getClass()) {
            return false;
        }
        Author that = (Author)other;
        return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName);
    }
}
