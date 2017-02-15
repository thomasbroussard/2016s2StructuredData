/**
 * 
 */
package webservicesexample;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author tbrou
 *
 */
@WebService
public class CalculatorImpl implements ICalculator {

	/* (non-Javadoc)
	 * @see webservicesexample.ICalculator#add(java.lang.Long, java.lang.Long)
	 */
	
	@WebMethod
	public Long add(Long firstOperand, Long secondOperand) {
		if (firstOperand == null || secondOperand == null){
			return 0l;
		}
		System.out.println("got : first operand : " + firstOperand + " second operand : "+ secondOperand);
		return firstOperand + secondOperand;
	}
	
	

}
