import java.util.Scanner;
import java.time.LocalDate;

public class LeaveManagement385 {

    public static LeaveFactory leaveFactory = new LeaveFactory();
    public static EmployeeFactory employeeFactory = new EmployeeFactory();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Leave leave = leaveFactory.getLeave();
        Employee e = employeeFactory.getEmployee("TL");
        e.processLeave(leave);
        leave.display();
        sc.close();
        return;
    }
}

class LeaveFactory {
    public Leave getLeave() {
        System.out.println("\n<<< Hello! Fill the details for leave approval >>>\n");
        System.out.println(">> Enter your name");
        String empName = LeaveManagement385.sc.nextLine();
        System.out.println(">> Enter type of leave (CL, SL, VL)");
        String typeOfLeave = LeaveManagement385.sc.nextLine();
        if (typeOfLeave.equals("CL"))
            return new CasualLeave(empName);
        else if (typeOfLeave.equals("SL"))
            return new SickLeave(empName);
        else
            return new VacationLeave(empName);
    }
}

abstract class Leave {
    public String empname;
    public String leaveStatus;
    public String approvedBy;
    public LocalDate requestDate = LocalDate.now();
    public LocalDate approvalDate;

    Leave(String name) {
        this.empname = name;
    }

    public void setApprovedBy(String name) {
        this.approvedBy = name;
    }

    public void setApprovalDate() {
        this.approvalDate = LocalDate.now();
    }

    public void setLeaveStatus(String status) {
        this.leaveStatus = status;
    }

    public void display() {
        System.out.println("\n----Leave Report----");
        System.out.println("empName: " + this.empname);
        System.out.println("leaveStatus: " + this.leaveStatus);
        System.out.println("requestDate: " + this.requestDate);
        System.out.println("approvalDate: " + this.approvalDate);
        System.out.println("approvedBy: " + this.approvedBy);
    }
}

class SickLeave extends Leave {
    SickLeave(String name) {
        super(name);
    }
}

class CasualLeave extends Leave {
    String reason;

    public CasualLeave(String name) {
        super(name);
        System.out.println(">> Enter reason");
        this.reason = LeaveManagement385.sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Reason: " + this.reason);
    }
}

class VacationLeave extends Leave {
    LocalDate startDate;
    LocalDate endDate;

    public VacationLeave(String name) {
        super(name);
        System.out.println(">> Enter start date");
        this.startDate = LocalDate.parse(LeaveManagement385.sc.nextLine());
        System.out.println(">> Enter end date");
        this.endDate = LocalDate.parse(LeaveManagement385.sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Vacation Start date: " + this.startDate);
        System.out.println("vacation End date: " + this.endDate);
    }
}

class EmployeeFactory {
    public Employee getEmployee(String typeOfEmployee) {
        if (typeOfEmployee.equals("TL"))
            return new TechLead();
        else if (typeOfEmployee.equals("PM"))
            return new ProjectManager();
        else
            return new Director();
    }
}

abstract class Employee {
    public void processLeave(Leave leave) {
    };
}

class TechLead extends Employee {
    String higherLevel;

    public TechLead() {
        this.higherLevel = "PM";
    }

    @Override
    public void processLeave(Leave leave) {
        if (leave instanceof SickLeave) {
            leave.setApprovalDate();
            leave.setLeaveStatus("approved");
            leave.setApprovedBy("TechLead");
        } else {
            Employee projectManager = LeaveManagement385.employeeFactory.getEmployee(higherLevel);
            projectManager.processLeave(leave);
        }
    };
}

class ProjectManager extends Employee {
    String higherLevel;

    ProjectManager() {
        this.higherLevel = "Director";
    }

    @Override
    public void processLeave(Leave leave) {
        if (leave instanceof CasualLeave) {
            leave.setApprovalDate();
            leave.setLeaveStatus("approved");
            leave.setApprovedBy("ProjectManager");
        } else {
            Employee director = LeaveManagement385.employeeFactory.getEmployee(higherLevel);
            director.processLeave(leave);
        }
    };
}

class Director extends Employee {
    @Override
    public void processLeave(Leave leave) {
        if (leave instanceof VacationLeave) {
            leave.setApprovalDate();
            leave.setLeaveStatus("approved");
            leave.setApprovedBy("Director");
        } else {
            leave.setLeaveStatus("rejected");
        }
    };
}