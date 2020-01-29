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
    public String action;
    private String params;
    private String url ;
    private static String loginSelector;
    private static String loginValue;
    private static String passSelector;
    private static String passValue;
    private static String BTNEnter;


    public Parser() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(new File("hptests.xml"));

       XPathFactory xPathFactory = XPathFactory.newInstance();
       XPath xPath = xPathFactory.newXPath();
       url = xPath.evaluate("/auth/Step[1]/params/url", document);
       loginSelector = xPath.evaluate("/auth/Step[2]/params/selector", document);
       loginValue = xPath.evaluate("/auth/Step[2]/params/value", document);
       passSelector = xPath.evaluate("/auth/Step[3]/params/selector", document);
       passValue = xPath.evaluate("/auth/Step[3]/params/value", document);
       BTNEnter = xPath.evaluate("/auth/Step[4]/params/selector", document));






//        NodeList steps = document.getElementsByTagName("Step");
//
//        for(int i=0; i < steps.getLength(); i++){
//            Element step = (Element ) steps.item(i);
//            action = step.getElementsByTagName("action").item(0).getNodeValue();
//            params = step.getElementsByTagName("params").item(0).getChildNodes().item(0).getNodeValue();
//            url = step.getElementsByTagName("url").item(0).getChildNodes().item(0).getNodeValue();
//        }
    }



    public static String getUrl() {
        return url;
    }

    public static String getBTNEnter() {
        return BTNEnter;
    }

    public static String getLoginSelector() {
        return loginSelector;
    }

    public static String getLoginValue() {
        return loginValue;
    }

    public static String getPassValue() {
        return passValue;
    }

    public static String getPassSelector() {
        return passSelector;
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
