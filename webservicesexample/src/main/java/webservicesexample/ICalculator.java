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
public interface ICalculator {
	
	@WebMethod
	Long add(Long firstOperand, Long secondOperand);

}
