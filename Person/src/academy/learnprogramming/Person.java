package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
}

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        if (age < 0) ||(age > 100) {
            return 0;
        }
    }

    public void isTeen() {
        if (setAge > 12) {
            return true;
        }else {
            return false;
            }
        }
    }

    public void getFullName() {
        if ()

}