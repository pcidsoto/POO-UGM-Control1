package managesystem;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import users.Employee;
import work.WorkAssignment;

public class SystemManage {
    private ArrayList<Employee> employees;

    public SystemManage() {
        employees = new ArrayList<>();
        // Para poder ver los tildes en la consola.
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Método para mostrar la información en formato de tabla
    public void displayEmployeeInfo() {
        System.out.println("==========================================================================================================");
        System.out.printf("%-40s %-15s %-15s %-20s %-10s %-10s\n", 
            "ID", "Nombre", "Área", "Tareas", "Horas", "Bono");
        System.out.println("==========================================================================================================");

        for (Employee emp : employees) {
            for (WorkAssignment assignment : emp.getAssignments()) {
                System.out.printf("%-40s %-15s %-15s %-20s %-10d %.2f\n",
                    emp.getId(),
                    emp.getName(),
                    assignment.getArea(),
                    String.join(", ", assignment.getDailyTasks()),
                    assignment.getHoursWorked(),
                    assignment.getProductionBonus());
            }
        }
        System.out.println("==========================================================================================================");
    }
}
