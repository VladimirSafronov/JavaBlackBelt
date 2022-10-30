package generics.game;

public class Test {

  public static void main(String[] args) {
    Scholar scholar1 = new Scholar("Ivan", 14);
    Scholar scholar2 = new Scholar("Masha", 15);
    Student student1 = new Student("Petr", 20);
    Student student2 = new Student("Lera", 21);
    Employee employee1 = new Employee("Grisha", 35);
    Employee employee2 = new Employee("Olya", 30);

    Team<Scholar> scholarTeam = new Team<>("Dragons");
    scholarTeam.addNewParticipant(scholar1);
    scholarTeam.addNewParticipant(scholar2);
//    scholarTeam.addNewParticipant(student1);
//    scholarTeam.addNewParticipant(employee1);
    Team<Student> studentTeam = new Team<>("Elfs");
    studentTeam.addNewParticipant(student1);
    studentTeam.addNewParticipant(student2);
    Team<Employee> employeeTeam = new Team<>("Goblins");
    employeeTeam.addNewParticipant(employee1);
    employeeTeam.addNewParticipant(employee2);
//    Team<String> otherTeam = new Team<>("Fantasy");
//    otherTeam.addNewParticipant("King Lion");
    Team<Scholar> scholarTeam2 = new Team<>("Bears");
    scholarTeam2.addNewParticipant(new Scholar("Andrey", 13));
    scholarTeam2.addNewParticipant(new Scholar("Lena", 14));

//    scholarTeam.playWith(studentTeam);
    scholarTeam.playWith(scholarTeam2);
  }
}
