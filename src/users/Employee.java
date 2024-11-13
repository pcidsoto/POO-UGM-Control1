package users;

import java.util.ArrayList;
import java.util.UUID;
import work.WorkAssignment;

public class Employee {
    private String id;
    private String name;
    private ArrayList<WorkAssignment> assignments;

    public Employee(String name) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.name = name;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(WorkAssignment assignment) {
        assignments.add(assignment);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public ArrayList<WorkAssignment> getAssignments() { return assignments; }
}
