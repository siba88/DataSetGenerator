package fileGenerator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Instance;

public class XmlGenerator {
	
	Instance instance;
	String xml;

	public XmlGenerator(Instance instance) {
		super();
		this.instance = instance;
		generateXml();
	}
	
	private void generateXml(){
		try {
            JAXBContext context = JAXBContext.newInstance(Instance.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            // Write to System.out for debugging
            // m.marshal(emp, System.out);
 
            // Write to File
            m.marshal(instance, new File("xml/"+instance.getFileName()+".xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}

}
