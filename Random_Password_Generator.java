import java.util.Random;

public class Random_Password_Generator {
    public static void main(String[] args) {
        Random shuffle = new Random();
        String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"
                +"0123456789"+"~`!@#$%^&*()_+-={}[]|;:'<>?,./"+"\\"+'"';
        //System.out.println(characters.length());

        StringBuffer password = new StringBuffer();
        System.out.println();
        for (int i = 0; i < 21; i++) {
            password.append(characters.charAt(shuffle.nextInt(93)));
        }

        System.out.println("Password: "+password);
    }
}
