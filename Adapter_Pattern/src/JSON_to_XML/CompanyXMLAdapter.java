package JSON_to_XML;

@XmlRootElement(name = "company")
public class CompanyXMLAdapter {
    public static String convertToXML(Company company) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(company, stringWriter);
        
        return stringWriter.toString();
    }
}
