import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//This programme is a custom password generator for generating random passwords...

public class PasswordGenerator {

  public static String Input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello there, \nWhat is your name?: ");
    String name = sc.nextLine();

    return "Welcome " + name + "!";
  }

  public static String Password(String pass) {
    System.out.println("Kindly wait as I randomize your password...");
    System.out.println("Generating strong password...");
    try {
            Thread.sleep(5000);
    } catch (InterruptedException e) {
            e.printStackTrace();
    }
    try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(pass.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
  }

  public static void main(String[] args) throws NoSuchAlgorithmException {
    PasswordGenerator.Input();
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Please enter the name your would like to be randomized as your password: ");
    String pass = sc1.nextLine();
    System.out.println("Your new random password is " + PasswordGenerator.Password(pass));
  }
}
