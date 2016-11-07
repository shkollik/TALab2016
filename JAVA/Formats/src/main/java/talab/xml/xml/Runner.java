package talab.xml.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

/**
 * Created by Vladyslav_Shkola on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, IOException, XPathExpressionException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(Runner.class.getResourceAsStream("/Clients.xml"));

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();

        XPathExpression expr = xpath.compile("/clients/list/item[@id=1]/surname");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);
        System.out.println("Surname of fist item is " + result);

        XPathExpression exprList = xpath.compile("/clients/list/item");
        NodeList nodeList = (NodeList) exprList.evaluate(document, XPathConstants.NODESET);
        for(int i = 0; i < nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println("id = " + elem.getAttribute("id") + " surname = "
                    + elem.getElementsByTagName("surname").item(0).getFirstChild().getNodeValue()
                    + " name = " + elem.getElementsByTagName("name").item(0).getFirstChild().getNodeValue()
                    + " identification_code = " + (elem.getElementsByTagName("identification_code").item(0).getFirstChild().getNodeValue())
                    + " phone_number = " + elem.getElementsByTagName("phone_number").item(0).getFirstChild().getNodeValue());
        }

        XPathExpression expr3 = xpath.compile("count(//item)");
        String result2 = (String) expr3.evaluate(document, XPathConstants.STRING);
        System.out.println("Number of items is " + result2);


    }
}
