// Interface for all employees
public interface IEmployee {
	void salary();
}

// Interface for managers
public interface IManager {
	void hire();

	void train();
}

// Interface for CEOs
public interface ICEO {
	void addBonus();

	void makeDecisions();

	void addStocks();
}

// Implementation for CEO
class CEO implements IEmployee, IManager, ICEO {
	@Override
	public void salary() {
		System.out.println("Getting the salary...");
	}

	@Override
	public void hire() {
		System.out.println("Hiring employees...");
	}

	@Override
	public void train() {
		System.out.println("Training employees...");
	}

	@Override
	public void addBonus() {
		System.out.println("Adding bonus at the end of the year...");
	}

	@Override
	public void makeDecisions() {
		System.out.println("Making decisions...");
	}

	@Override
	public void addStocks() {
		System.out.println("Getting shares of the company as bonus...");
	}
}

public class IEmployee {
	public static void main(String[] args) {
		CEO ceo = new CEO();
		ceo.addBonus();
		ceo.salary();
		ceo.makeDecisions();
		ceo.addStocks();
	}
}
