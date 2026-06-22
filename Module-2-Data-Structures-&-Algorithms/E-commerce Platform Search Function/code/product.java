import java.util.*;

public class product {
    public static void main(String[] args) {
        int i, c = 0, lb, ub, mid;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products = ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] pid = new int[n];
        String[] cat = new String[n];
        String[] pname = new String[n];

        System.out.println("Enter the product IDs:");
        for (i = 0; i < n; i++) {
            pid[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("Enter the categories:");
        for (i = 0; i < n; i++) {
            cat[i] = sc.nextLine();
        }

        System.out.println("Enter the product names:");
        for (i = 0; i < n; i++) {
            pname[i] = sc.nextLine();
        }

        int choice;

        do {
            System.out.println("\n1. Linear Search by Product ID");
            System.out.println("2. Linear Search by Product Name");
            System.out.println("3. Linear Search by Product Category");
            System.out.println("4. Binary Search by Product ID");
            System.out.println("5. Binary Search by Product Name");
            System.out.println("6. Binary Search by Product Category");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    c = 0;
                    System.out.print("Enter Product ID: ");
                    int s = sc.nextInt();
                    sc.nextLine();

                    for (i = 0; i < n; i++) {
                        if (pid[i] == s) {
                            c = 1;
                            break;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 2:
                    c = 0;
                    System.out.print("Enter Product Name: ");
                    String s1 = sc.nextLine();

                    for (i = 0; i < n; i++) {
                        if (pname[i].equalsIgnoreCase(s1)) {
                            c = 1;
                            break;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 3:
                    c = 0;
                    System.out.print("Enter Product Category: ");
                    String s2 = sc.nextLine();

                    for (i = 0; i < n; i++) {
                        if (cat[i].equalsIgnoreCase(s2)) {
                            c = 1;
                            break;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 4:
                    c = 0;
                    Arrays.sort(pid);

                    System.out.print("Enter Product ID: ");
                    s = sc.nextInt();
                    sc.nextLine();

                    lb = 0;
                    ub = n - 1;

                    while (lb <= ub) {
                        mid = (lb + ub) / 2;

                        if (pid[mid] == s) {
                            c = 1;
                            break;
                        } else if (pid[mid] < s) {
                            lb = mid + 1;
                        } else {
                            ub = mid - 1;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 5:
                    c = 0;
                    Arrays.sort(pname);

                    System.out.print("Enter Product Name: ");
                    s1 = sc.nextLine();

                    lb = 0;
                    ub = n - 1;

                    while (lb <= ub) {
                        mid = (lb + ub) / 2;

                        if (pname[mid].equalsIgnoreCase(s1)) {
                            c = 1;
                            break;
                        } else if (pname[mid].compareToIgnoreCase(s1) < 0) {
                            lb = mid + 1;
                        } else {
                            ub = mid - 1;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 6:
                    c = 0;
                    Arrays.sort(cat);

                    System.out.print("Enter Product Category: ");
                    s2 = sc.nextLine();

                    lb = 0;
                    ub = n - 1;

                    while (lb <= ub) {
                        mid = (lb + ub) / 2;

                        if (cat[mid].equalsIgnoreCase(s2)) {
                            c = 1;
                            break;
                        } else if (cat[mid].compareToIgnoreCase(s2) < 0) {
                            lb = mid + 1;
                        } else {
                            ub = mid - 1;
                        }
                    }

                    if (c == 1)
                        System.out.println("Product found");
                    else
                        System.out.println("Product not found");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}