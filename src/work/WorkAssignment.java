package work;

// Clase para manejar la información de tareas y áreas
public class WorkAssignment {
    private String area;
    private String[] dailyTasks;
    private int hoursWorked;
    private double productionBonus;
    private int weekNumber;

    public WorkAssignment(String area, String[] dailyTasks, int hoursWorked, double productionBonus, int weekNumber) {
        this.area = area;
        this.dailyTasks = dailyTasks;
        this.hoursWorked = hoursWorked;
        this.productionBonus = productionBonus;
        this.weekNumber = weekNumber;
    }

    // Getters y setters
    public String getArea() { return area; }
    public String[] getDailyTasks() { return dailyTasks; }
    public int getHoursWorked() { return hoursWorked; }
    public double getProductionBonus() { return productionBonus; }
    public int getWeekNumber() { return weekNumber; }
}
