/**
 * 
 */
package webservicesexample;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author tbrou
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
	
			URL urlObj = new URL("http://localhost:9080/webservicesexample-0.0.1-SNAPSHOT/CalculatorImpl?wsdl");
			String namespaceURI = "http://webservicesexample/";
			QName qname = new QName(namespaceURI, "CalculatorImplService");
			QName portQName = new QName(namespaceURI, "CalculatorImplPort");

			Service xmlService = Service.create(urlObj, qname);

			ICalculator calculator = (ICalculator) xmlService.getPort(portQName, ICalculator.class);
			Long count = calculator.add(10l, 20l);
			System.out.println(count);

	}

}
