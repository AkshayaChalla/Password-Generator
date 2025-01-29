import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args){
        int length = 10;
        String password = generatePassword(length);
        System.out.println("generated Password" + password);
    }

    public static String generatePassword(int length) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Random rd = new Random();
        StringBuilder password = new StringBuilder();
        for(int i =0 ; i < length;i++ ){
            int index = rd.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }
    
}
