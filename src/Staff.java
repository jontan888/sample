import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Staff {
// testing
  private int id;
  private String ic;
  private String name;
  private LocalDate birthDate;
  private String designation;
  private String department;
  private static int nextId = 1001;

  public Staff() {
    this("", "", LocalDate.now(), "", "");
  }

  public Staff(String ic, String name, LocalDate birthDate, String designation, String department) {
    id = nextId++;
    this.ic = ic;
    this.name = name;
    this.birthDate = birthDate;
    this.designation = designation;
    this.department = department;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getIc() {
    return ic;
  }

  public void setIc(String ic) {
    this.ic = ic;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getAge() {
    LocalDate today = LocalDate.now();
    int age = Period.between(birthDate, today).getYears();
    return age;
  }
  
  public String getBirthDateString() {
    return birthDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
  }
  
  

}
