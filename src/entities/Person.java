package entities;

/*
 * Defini��o da classe abstrata onde definimos todos os atributos comuns de suas futuras subclasses
 */
public abstract class Person {
		
		//Defini��o dos atributos
		private String name;
		private Double annualIncome;
		
		//Construtor padr�o
		public Person()
		{
			
		}
		
		//Construtor com argumentos
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
		
		// M�todo abstrato que obriga a suas subclasses a o implementarem de acordo com sua especificade
		public abstract double tax();
		
		public String toString()
		{
			return name 
					+": $ "
					+String.format("%.2f", tax());
		}

}
