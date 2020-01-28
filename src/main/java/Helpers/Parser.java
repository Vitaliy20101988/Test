package Helpers;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;



public class Parser {

    public static Document document;
    static File file;
    public static XPathFactory xPathFactory;

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        file = new File("hptests.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(file);

        xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        String url = xPath.evaluate("/auth/step[1]/params", document);

//        System.out.println(url);
    }


}










//        Element authElement = (Element) document.getElementsByTagName("auth");
//        String steps = authElement.getAttribute("step");
//
//        NodeList paramsNodeList = document.getElementsByTagName("params");
//
//        List<Params> paramsList = new ArrayList<>();
//        for (int i = 0; i < paramsNodeList.getLength(); i++){
//            if (paramsNodeList.item(i).getNodeType() == Node.ELEMENT_NODE){
//                Element paramsElement = (Element) paramsNodeList.item(i);
//
//                Params params = new Params();
//
//                NodeList childNodes = paramsElement.getChildNodes();
//                for (int j = 0; j < childNodes.getLength(); j++){
//                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
//                        Element childElement = (Element) childNodes.item(j);
//
//                        switch (childElement.getNodeName()) {
//                            case "url": {
//                                params.setUrl(childElement.getTextContent());
//                            }break;
//
//                            case "selector":{
//                                params.setSelector(childElement.getTextContent());
//                            }break;
//
//                            case "value":{
//                                params.setValue(childElement.getTextContent());
//                            }break;
//                        }
//
//                    }
//                }
//            }
//
//        }
//    }
//}
//
//class Params{
//    private String url;
//    private String selector;
//    private String value;
//
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getSelector() {
//        return selector;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//
//    public void setSelector(String textContent) {
//    }
//
//    public void setUrl(String textContent) {
//    }
//
//    public void setValue(String textContent) {
//   }
//}


//       XPathFactory xPathFactory = XPathFactory.newInstance();
//       XPath xPath = xPathFactory.newXPath();
//       String url = xPath.evaluate("/auth/step[1]/params", document);
