/*Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and

getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate

that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.

The following are the interest rates of these banks.

ICICIBank - Savings 4% Fixed 8.5% and

KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank();

*/
 abstract class GeneralBank {
	abstract double getSavingInterestRate();
	abstract double getFixedDipositInterestRate(); 
}
 
class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
		return 4;
	}
	double getFixedDipositInterestRate()
{
		return 8.5;
		}
}

class KotMBank extends GeneralBank{
	double getSavingInterestRate() {
		return 6;
	}
	double getFixedDipositInterestRate()
{
		return 9;
		}
}
public class BankSolution {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		System.out.println("Saving Interest" + i.getSavingInterestRate() + "%");
		System.out.println( "fixed value " + i.getFixedDipositInterestRate()  + "%");
		
		 KotMBank k=new KotMBank();
		 System.out.println( "Saving Interest" + k.getSavingInterestRate()  + "%");
		System.out.println("fixed value " + k.getFixedDipositInterestRate()  + "%");
		
	 GeneralBank g=new KotMBank();
	 System.out.println( "Saving Interest" +g.getSavingInterestRate()  + "%");
		System.out.println("fixed value " + g.getFixedDipositInterestRate()  + "%");
		
		GeneralBank g1=new ICICIBank();
		System.out.println( "Saving Interest" +g1.getSavingInterestRate() + "%");
		System.out.println("fixed value " + g1.getFixedDipositInterestRate()  + "%");
	}

}
