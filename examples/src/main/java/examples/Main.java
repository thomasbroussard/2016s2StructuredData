/**
 * 
 */
package examples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author tbrou
 *
 */
public class Main {

	
	public static void main(String[] args) throws TransformerConfigurationException, TransformerException, TransformerFactoryConfigurationError, SAXException, IOException, ParserConfigurationException, XPathExpressionException {
//		xmlOperations();
		Identity identity = new Identity("Thomas Broussard", "tbroussard@gmail.com", "+0123456789");
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("src/main/resources/identitiesFromJackson.json"), identity);
	
		File jsonFile = new File("src/main/resources/identities.json");
		List<Identity> identities = objectMapper.readValue(jsonFile, new TypeReference<List<Identity>>(){});
		identities.add(new Identity("Clément Serrano", "cserr@gmail.com", "+1234569878"));
		objectMapper.writeValue(new File("src/main/resources/identitiesFromJackson.json"), identities);
		
		System.out.println(objectMapper.writeValueAsString(identities));
		
	}

	/**
	 * @throws TransformerConfigurationException
	 * @throws TransformerFactoryConfigurationError
	 * @throws TransformerException
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws XPathExpressionException
	 */
	private static void xmlOperations() throws TransformerConfigurationException, TransformerFactoryConfigurationError,
			TransformerException, SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		Transformer newTransformer = TransformerFactory.newInstance().
				newTransformer(new StreamSource(new File("src/main/resources/descriptionToHtml.xsl")));
		newTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
		newTransformer.setOutputProperty(OutputKeys.METHOD, "html");
		newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		newTransformer.transform(
				new StreamSource(new File("src/main/resources/identities.xml")), 
				new StreamResult("src/main/resources/identities.javaout.xml"));
		
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("src/main/resources/identities.xml"));
		XPathExpression xpath = XPathFactory.newInstance().newXPath().compile("//property[@name='email']");
		System.out.println(xpath.evaluate(document.getDocumentElement()));
	}
}
