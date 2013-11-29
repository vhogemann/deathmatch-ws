//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.27 at 11:31:54 AM BRST 
//


package ws.deathmatch.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.deathmatch.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("http://deathmatch.ws/service", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.deathmatch.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeathmatchResponse }
     * 
     */
    public DeathmatchResponse createDeathmatchResponse() {
        return new DeathmatchResponse();
    }

    /**
     * Create an instance of {@link DeathmatchResponse.Player }
     * 
     */
    public DeathmatchResponse.Player createDeathmatchResponsePlayer() {
        return new DeathmatchResponse.Player();
    }

    /**
     * Create an instance of {@link DeathmatchRequest }
     * 
     */
    public DeathmatchRequest createDeathmatchRequest() {
        return new DeathmatchRequest();
    }

    /**
     * Create an instance of {@link DeathmatchResponse.Player.Coords }
     * 
     */
    public DeathmatchResponse.Player.Coords createDeathmatchResponsePlayerCoords() {
        return new DeathmatchResponse.Player.Coords();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeathmatchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://deathmatch.ws/service", name = "request")
    public JAXBElement<DeathmatchRequest> createRequest(DeathmatchRequest value) {
        return new JAXBElement<DeathmatchRequest>(_Request_QNAME, DeathmatchRequest.class, null, value);
    }

}
