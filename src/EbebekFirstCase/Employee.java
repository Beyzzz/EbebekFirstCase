package EbebekFirstCase;

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double vergi = 0;
		if (salary > 1000) {
			vergi = (salary * 3) / 100;
		}

		return vergi;

	}

	public double bonus() {
		double bonus = 0;
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;

		}

		return bonus;
	}

	public double raiseSalary() {
		double raiseSalary = 0;

		if (2021 - hireYear < 10) {
			raiseSalary = (salary * 5) / 100;
		} else if (9 < 2021 - hireYear && 2021 - hireYear < 20) {
			raiseSalary = (salary * 10) / 100;
		} else if (19 < 2021 - hireYear) {
			raiseSalary = (salary * 15) / 100;
		}
		return raiseSalary;

	}

	public String toString() {
		double tax = tax();
		double bonus = bonus();
		double raiseSalary = raiseSalary();
		String bilgi = ("Adı: " + name + "\n Maaşı: " + salary + "\n Çalısma Saati: " + workHours + "\n Baslangıç Yılı: "
				+ hireYear + "\n Vergi: " + tax + "\n Bonus: " + bonus + "\n Maaş Artışı:" + raiseSalary
				+ "\n Vergi ve Bonuslar ile birlikte maaş: " + (salary + bonus - tax) + "\n Toplam Maaş: "
				+ (salary + bonus + raiseSalary - tax));
		return bilgi;
	}

}

