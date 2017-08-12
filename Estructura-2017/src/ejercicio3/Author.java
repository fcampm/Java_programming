
package ejercicio3;
/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Author {
   
    // Instance variables.
    private String name;
    private String email;
    private char gender;
    
    // Constructor that receives a name, an email and a gender.
    public Author (String name, String email, char gender){
        
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Method that returns the name value.
    public String getName() {
        return this.name;
    }

    // Method that returns the email value.
    public String getEmail() {
        return this.email;
    }

    // Method that returns the gender value.
    public char getGender() {
        return this.gender;
    }

    // Method that reassign the email value.
    public void setEmail(String email) {
        this.email = email;
    }

    // toString method that prints an output with the format the teacher asked.
    @Override
    public String toString() {
        return "Author[" + "name=" + name + ", email=" + email + ", gender=" + gender + ']';
    }        
}
