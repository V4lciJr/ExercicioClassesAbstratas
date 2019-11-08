package entities;

public class Company extends Person {
		
		//Definição do atributo específico dessa clase
		private Integer employeeNumber;
	
		public Company()
		{
			super();
		}
	
		public Company(String name, Double annualInconme, Integer employeeNumber) {
			super(name, annualInconme);
			this.employeeNumber = employeeNumber;
		}

		public Integer getEmployeeNumber() {
			return employeeNumber;
		}

		public void setEmployeeNumber(Integer employeeNumber) {
			this.employeeNumber = employeeNumber;
		}
		
		//Implementação do método abstrato da super classe
		@Override
		public double tax() {
			double tax = getAnnualIncome();
			if(employeeNumber > 10)
			{
				tax = tax * 0.14;
			}
			else
			{
				tax = tax * 0.16;
			}
			return tax;
		}
		
		
}
