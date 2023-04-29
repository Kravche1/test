import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XML {
    private XML (){

    }

    public static void generateXML() throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();


        Element rootElement = document.createElement("departments");
        document.appendChild(rootElement);

        Element departmentElement = document.createElement("department");
        rootElement.appendChild(departmentElement);

        Element departmentName = document.createElement("name");
        departmentName.appendChild(document.createTextNode("HR"));
        departmentElement.appendChild(departmentName);

        Element departmentEmail = document.createElement("email");
        departmentEmail.appendChild(document.createTextNode("hr@oracle.com"));
        departmentElement.appendChild(departmentEmail);

        Element studentElement = document.createElement("department");
        rootElement.appendChild(studentElement);

        Element departmentFirstName = document.createElement("firstname");
        departmentFirstName.appendChild(document.createTextNode("IT"));
        studentElement.appendChild(departmentFirstName);

        Element departmentEmail2 = document.createElement("email");
        departmentEmail2.appendChild(document.createTextNode("it@java.com"));
        studentElement.appendChild(departmentEmail2);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(rootElement);

        StreamResult streamResult = new StreamResult(new File("C:/test/b.xml"));
        transformer.transform(domSource,streamResult);
    }
}