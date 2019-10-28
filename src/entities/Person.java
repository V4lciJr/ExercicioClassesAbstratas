package entities;

public abstract class Person {
		
		private String name;
		private Double annualIncome;
		
		public Person()
		{
			
		}
		
		public Person(String name, Double annualInconme)
		{
			this.name = name;
			this.annualIncome = annualInconme;
		}

		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}

		public Double getAnnualIncome() 
		{
			return annualIncome;
		}

		public void setAnnualIncome(Double annualIncome) 
		{
			this.annualIncome = annualIncome;
		}
		
		public abstract double tax();
		
		public String toString()
		{
			return name 
					+": $ "
					+String.format("%.2f", tax());
		}

}