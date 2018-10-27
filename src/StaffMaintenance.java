import java.time.LocalDate;
import java.util.*;

public class StaffMaintenance {
  private List<Staff> staffList;
  
  public StaffMaintenance() {
    staffList = new ArrayList<>();
  }
  
  public void addNewStaff() {
    Scanner scanner = new Scanner(System.in);
    Staff staff = new Staff();
    System.out.println("\nAdd New Staff");
    System.out.println("Staff ID: " + staff.getId());
    System.out.print("Enter staff IC: ");
    staff.setIc(scanner.nextLine());
    System.out.print("Enter staff name: ");
    staff.setName(scanner.nextLine());
    System.out.print("Enter staff DOB (DD-MM-YYYY): ");
    String birthDate = scanner.nextLine();
    String[] dateTokens = birthDate.split("-");
    int date = Integer.parseInt(dateTokens[0]);
    int month = Integer.parseInt(dateTokens[1]);
    int year = Integer.parseInt(dateTokens[2]);
    staff.setBirthDate(LocalDate.of(year, month, date));
    System.out.print("Enter designation: ");
    staff.setDesignation(scanner.nextLine());
    System.out.print("Enter department: ");
    staff.setDepartment(scanner.nextLine());
    staffList.add(staff);
  }
  
  public void displayStaff() {
    for (int i = 0; i < staffList.size(); ++i) {
      Staff staff = staffList.get(i);
      System.out.println("\nStaff ID: " + staff.getId());
      System.out.println("Staff IC: " + staff.getIc());
      System.out.println("Staff Name: " + staff.getName());
      System.out.println("Date of Birth: " + staff.getBirthDateString());
      System.out.println("Age (years): " + staff.getAge());
      System.out.println("Designation: " + staff.getDesignation());
      System.out.println("Department: " + staff.getDepartment());
    }
  }
  
  public int getMenuChoice(Scanner scanner) {
    int choice;
    System.out.println("\n\nMAIN MENU");
    System.out.println("=========");
    System.out.println("1. Add new staff");
    System.out.println("2. Display all staff");
    System.out.println("9. Exit");
    System.out.print("Enter choice: ");
    choice = scanner.nextInt();
    return choice;
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);
    int choice = 9;
    do {
      choice = getMenuChoice(scanner);
      switch(choice) {
        case 1: 
          addNewStaff();
          break;
        case 2:
          displayStaff();
          break;
        case 9: 
          System.out.println("Ending program ...");
          break;
        default:
          System.out.println("ERROR: Invalid choice.");
      }
    } while (choice != 9);
  }

  public static void main(String[] args) {
    StaffMaintenance staffMaintenance = new StaffMaintenance();
    staffMaintenance.run();
  }
  
}
