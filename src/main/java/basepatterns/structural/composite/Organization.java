package basepatterns.structural.composite;

public class Organization {
    public static void main(String[] args) {
        ITDepartment itDepartment = new ITDepartment();

        Employee ITDirector = new ITDirector();
        Employee teamLead = new TeamLead();
        Employee trainee = new Trainee();

        itDepartment.addEmployee(ITDirector);
        itDepartment.addEmployee(teamLead);
        itDepartment.addEmployee(trainee);

        itDepartment.work();
    }
}
