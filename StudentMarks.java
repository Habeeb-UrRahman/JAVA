import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int TotalStudents = sc.nextInt();
        int RollNo[] = new int[TotalStudents];
        String Name[] = new String[TotalStudents];
        String Department[] = new String[TotalStudents];
        double s1[] = new double[TotalStudents];
        double s2[] = new double[TotalStudents];
        double s3[] = new double[TotalStudents];
        double s4[] = new double[TotalStudents];
        double s5[] = new double[TotalStudents];
        double max[] = new double[TotalStudents];
        double p[] = new double[TotalStudents];
        double t[] = new double[TotalStudents];

        for (int i=0; i<TotalStudents; i++) {
            System.out.println();
            System.out.println("Enter student "+(i+1)+" details");
            System.out.println();
            System.out.print("Registration No: ");
            RollNo[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Student Name: ");
            Name[i] = sc.nextLine();
            System.out.print("Student Department: ");
            Department[i] = sc.nextLine();
            System.out.println("\n"+"Enter Student "+(i+1)+" marks");
            System.out.print("Maths marks: ");
            s1[i] = sc.nextInt();
            System.out.print("Physics marks: ");
            s2[i] = sc.nextInt();
            System.out.print("CSE-2005 marks: ");
            s3[i] = sc.nextInt();
            System.out.print("ECE marks: ");
            s4[i] = sc.nextInt();
            System.out.print("English marks: ");
            s5[i] = sc.nextInt();
            System.out.print("Max marks possible: ");
            max[i] = sc.nextInt();
            t[i] = (s1[i] + s2[i] + s3[i] + s4[i] + s5[i]);
            p[i] = (t[i]/max[i])*100;

        } 

        System.out.println();
        for (int i=0; i<TotalStudents; i++) {
            System.out.println("Student "+(i+1)+" Details");
            System.out.println();
            System.out.print("Name: "+Name[i]+"\n"+"Registration No: "+RollNo[i]+"\n"+"Department: "+
                              Department[i]+"\n"+"Total Marks obtained in all subjects combined: "+
                              t[i]+"/"+max[i]+"\n"+"Overall Percentage Obtained by "+Name[i]+": "+p[i]+" %"+"\n");
            
            System.out.println();
        }
        sc.close();
    }
}
