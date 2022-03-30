import java.util.Scanner;
class NestedTryCatch {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Try-Catch Block-1
        System.out.println("Running Try-Catch Block-1");
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Array of elements: {"+a[0]+", "+a[1]+", "+a[2]+", "+a[3]+", "+a[4]+"}");
        System.out.print("Enter index of the element you want to print: ");
        int ele = sc.nextInt();
        try {
            System.out.println("The element at the entered index is: "+a[ele]);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("'ArrayIndexOutOfBoundsException'");
			System.out.println("No element exists at the entered index in the array");
		}

        System.out.println("");

        // Try-Catch Block-2
        System.out.println("Runnig Try-Catch Block-2");
        System.out.println("Enter the numbers you want to divide");
        System.out.print("Enter a number (m): ");
        int m = sc.nextInt();
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        if (n==0) {
            try {
                int div = m/n;
                System.out.println(div);
            } 
            catch (ArithmeticException e2) { 
                System.out.println("Division by zero.");
                e2.printStackTrace();
            }
            System.out.println("Division by zero is not possible");
        }
        else {
            System.out.println("The quotient obtained after the division is: "+m/n);
        }
        System.out.println("");

        // Try-Catch-Finally Block
        System.out.println("Running Try-Catch-Finally Block");
        int b[] = {10,14,15};
        System.out.println("Array of elements: b[] = {"+b[0]+", "+b[1]+", "+b[2]+"}");
        System.out.print("Enter index of the element you want to print from the array b[]: ");
        int ele2 = sc.nextInt();
        try {
           System.out.println("Element at the entered index in the array is: " + b[ele2]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
           System.out.println("No element exists at the entered index in the given array");
        } 
        finally {
            System.out.println("");
            System.err.print("Enter the index of the element you want to access form the array b[]: ");
            int x = sc.nextInt();
            System.out.println("Element at the entered index is: " + b[x]);
            System.out.println("The finally statement is executed");
        }
        sc.close();
        System.out.println("");
    }
}



