import java.util.Scanner;

public class Template {

    public static void main(String[] args) {
        System.out.println("Bug Report Form");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Title");
        String Title = scanner.next();
        System.out.println();

        System.out.println("Enter Defect ID");
        String ID = scanner.next();
        System.out.println();

        System.out.println("Enter Version");
        String Version = scanner.next();
        System.out.println();

        System.out.println("Enter Defect Description");
        String Description = scanner.next();
        System.out.println();

        System.out.println("Date raised");
        String Date = scanner.next();
        System.out.println();

        System.out.println("Enter the time Ticket was Raised");
        String TIme = scanner.next();
        System.out.println();

        System.out.println("Reported");
        String Name = scanner.next();
        System.out.println();

        System.out.println("Status");
        String Status = scanner.next();
        System.out.println();

        System.out.println("Fixed by");
        String name = scanner.next();
        System.out.println();

        System.out.println("Severity");
        String Severity = scanner.next();
        System.out.println();

        System.out.println("Priority");
        String Priority = scanner.next();
        System.out.println();

        System.out.println("Attachment");
        String attachment = scanner.next();
        System.out.println();

        System.out.println("Enter Title:" + Title);
        System.out.println("Enter Defect ID :" +  ID);
        System.out.println("Enter Version : " + Version);
        System.out.println("Enter Defect Description:" + Description);
        System.out.println("Date raised :" + Date);
        System.out.println("Enter the time Ticket was Raised : " + TIme);
        System.out.println("Reported :" + Name);
        System.out.println("Status: "+ Status);
        System.out.println("Fixed by:"+ name);
        System.out.println("Severity:"+ Severity);
        System.out.println("Priority:"+ Priority);
        System.out.println("Attachment :"+ attachment);

    }


}


