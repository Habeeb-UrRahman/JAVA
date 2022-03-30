import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;

public class WebSite {
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.print("Enter url (http://www.xyz.com) format  : ");
            String url =   sc.next();
            Desktop.getDesktop().browse(new URL(url).toURI());
            sc.close();
            System.out.println("The entered website/webpage will be opened in the system default browser");
        }
        catch(Exception E){
            System.err.println("Exp : "+E.getMessage());
        }   
    }
}
// JAVA
