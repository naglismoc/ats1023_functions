public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private boolean gender;

    public Person(){

    }
    public Person(String firstName,String lastName, int birthYear, boolean gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public int currentAge(){
        return 2023 - this.birthYear;
    }
    public int currentAge(int currentYear){
        return currentYear - this.birthYear;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.birthYear + " " + this.gender;
    }


}
