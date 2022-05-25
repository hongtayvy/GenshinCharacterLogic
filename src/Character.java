public class Character {
    private String firstName;
    private String lastName;
    private String elementType;
    private String weaponType;

    /**
     * This is an empty constructor for the Character object
     */
    public Character() {}

    /**
     * This is the constructor to build a Character object with the following parameters.
     * @param firstName
     * @param lastName
     * @param elementType
     * @param weaponType
     */
    public Character(String firstName, String lastName, String elementType, String weaponType){
       this.firstName = firstName;
       this.lastName = lastName;
       this.elementType = elementType;
       this.weaponType = weaponType;
    }

    public String getFirstName() {
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

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Character{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", elementType='" + elementType + '\'' +
                ", weaponType='" + weaponType + '\'' +
                '}';
    }
}
