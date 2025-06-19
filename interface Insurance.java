interface Insurance {
    double calculatePremium(double amount);
    double calculateReturn(double amount);
}

class LifeInsurance implements Insurance {
    String agentName;
    double agentSalary;

    LifeInsurance(String agentName, double agentSalary) {
        this.agentName = agentName;
        this.agentSalary = agentSalary;
    }

    public double calculatePremium(double amount) {
        return amount * 0.05;
    }

    public double calculateReturn(double amount) {
        return amount * 0.02;
    }

    void displayAgentInfo() {
        System.out.println("Agent Name: " + agentName);
        System.out.println("Agent Salary: ₹" + agentSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        LifeInsurance obj = new LifeInsurance("Meena", 22000);
        obj.displayAgentInfo();
        System.out.println("Premium: ₹" + obj.calculatePremium(100000));
        System.out.println("Return: ₹" + obj.calculateReturn(100000));
    }
}
