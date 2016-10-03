package FileFormats.xml;

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
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory  dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse(
                Runner.class.getResourceAsStream("Goods.xml"));

        //Element root = document.getDocumentElement();

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/goods/list/item[@id=1]/name");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);

        System.out.println(result);

        XPathExpression exprList = xpath.compile("goods/list/item");
        NodeList  nodeList = (NodeList) exprList.evaluate(document, XPathConstants.STRING);
        for(int i = 0; i < nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println(
             elem.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
        }

    }
}
