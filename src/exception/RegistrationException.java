/*package exception;

public class RegistrationException extends Exception {
    public RegistrationException(String message) {
        super(message);
    }
}*/
package exception;

public class RegistrationException extends Exception {

    // Default constructor
    public RegistrationException() {
        super("Registration error occurred");
    }

    // Parameterized constructor
    public RegistrationException(String message) {
        super(message);
    }
} 