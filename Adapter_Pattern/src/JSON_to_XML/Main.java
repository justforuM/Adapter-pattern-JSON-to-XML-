package JSON_to_XML;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String json = "[{\"company\":\"3M\",\"description\":\"3M, based in Minnesota, may be best known for its Scotch tape and Post-It Notes, but it also produces sand paper, adhesives, medical products, computer screen filters, food safety items, stationery products and many products used in automotive, marine, and aircraft industries.\",\"initial_price\":44.28,\"price_2002\":56.27,\"price_2007\":95.85,\"symbol\":\"MMM\"},{\"company\":\"Amazon.com\",\"description\":\"Amazon.com, Inc. is an online retailer in North America and internationally. The company serves consumers through its retail Web sites and focuses on selection, price, and convenience. It also offers programs that enable sellers to sell their products on its Web sites, and their own branded Web sites. In addition, the company serves developer customers through Amazon Web Services, which provides access to technology infrastructure that developers can use to enable virtually various type of business. Further, it manufactures and sells the Kindle e-reader. Founded in 1994 and headquartered in Seattle, Washington.\",\"initial_price\":89.38,\"price_2002\":17.01,\"price_2007\":93.43,\"symbol\":\"AMZN\"}]";

        ObjectMapper objectMapper = new ObjectMapper();
        List<Company> companies = objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, Company.class));
        
        for (Company company : companies) {
            String xml = CompanyXMLAdapter.convertToXML(company);
            System.out.println(xml);
        }
    }
}
