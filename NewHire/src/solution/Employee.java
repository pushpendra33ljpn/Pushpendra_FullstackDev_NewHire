package solution;

import java.util.Random;

public class Employee {
private String firstName;
private String LastName;
private Department department;
private String Email;
private char[] Password;



public Employee(String firstname, String lastname,Department department) {
	this.department=department;
	this.firstName=firstname;
	this.LastName=lastname;
	this.Password=generatePassword();
	this.Email=generateEmailAddress(department);
}

public String generateEmailAddress(Department department) {
	Email=firstName+LastName+"@"+department.toString()+".abc.in";
	return Email;
}

public char[] generatePassword()
{

    // A strong password has Cap_chars, Lower_chars,
    // numeric value and symbols. So we are using all of
    // them to generate our password
    String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Small_chars = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
            String symbols = "!@#$%^&*_=+-/.?<>)";


    String values =  numbers+Capital_chars + symbols+ Small_chars ;

    // Using random method
    Random rndm_method = new Random();

    char[] password = new char[10];

    for (int i = 0; i < 10; i++)
    {
        // Use of charAt() method : to get character value
        // Use of nextInt() as it is scanning the value as int
        password[i] =
          values.charAt(rndm_method.nextInt(values.length()));

    }
    return password;
}

@Override
public String toString() {
	return "Dear " + firstName + " Your generated Credentials are as follows \n" + " Email= "
			+ Email + "\n Password=" + Password;
}

}

