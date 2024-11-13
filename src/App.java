import managesystem.SystemManage;
import users.Employee;
import work.WorkAssignment;

public class App {
    
    public static void main(String[] args) throws Exception {
         // Ejemplo de uso del sistema
        SystemManage system = new SystemManage();

        // Crear algunos empleados de ejemplo
        Employee emp1 = new Employee("Juan Pérez");
        Employee emp2 = new Employee("María García");

        // Agregar empleados al sistema
        system.addEmployee(emp1);
        system.addEmployee(emp2);

        // Crear tareas de trabajo, no se entrega detalle de tareas, pero pueden ser clases con atributos.
        String[] tasks1 = {"Inventario", "Limpieza"};
        String[] tasks2 = {"Ventas", "Atención"};

        WorkAssignment assignment1 = new WorkAssignment("Almacén", tasks1, 40, 150.0, 1);
        WorkAssignment assignment2 = new WorkAssignment("Ventas", tasks2, 35, 200.0, 1);

        // Agregar tareas a empleados
        emp1.addAssignment(assignment1);
        emp2.addAssignment(assignment2);

        // Mostrar la información
        system.displayEmployeeInfo();
    }
}
