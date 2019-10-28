package entities;

public class PhysicalPerson extends Person{

		private Double healthSpending;
	
		public PhysicalPerson()
		{
			super();
		}
		
		public PhysicalPerson(String name, Double annualInconme, Double healthSpending)
		{
			super(name, annualInconme);
			this.healthSpending = healthSpending;
		}
		
		public Double getHealthSpending() {
			return healthSpending;
		}

		public void setHealthSpending(Double healthSpending) {
			this.healthSpending = healthSpending;
		}

		@Override
		public double tax() 
		{
			double tax = getAnnualIncome();
			if(getAnnualIncome() < 20000.0) 
			{
				tax = tax * 0.15 - healthSpending * 0.5; 
			}
			else 
			{
				tax = tax * 0.25 - healthSpending * 0.5;
			}
				
			return tax;
		}
	
}
