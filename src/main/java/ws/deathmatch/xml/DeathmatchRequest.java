
package ws.deathmatch.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeathmatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeathmatchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="command" type="{http://deathmatch.ws/service}CommandEnum"/>
 *       &lt;/sequence>
 *       &lt;attribute name="player" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeathmatchRequest", namespace = "http://deathmatch.ws/service", propOrder = {
    "command"
})
public class DeathmatchRequest {

    @XmlElement(namespace = "http://deathmatch.ws/service", required = true)
    protected CommandEnum command;
    @XmlAttribute(name = "player")
    protected Integer player;
    @XmlAttribute(name = "secret")
    protected String secret;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link CommandEnum }
     *     
     */
    public CommandEnum getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandEnum }
     *     
     */
    public void setCommand(CommandEnum value) {
        this.command = value;
    }

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayer(Integer value) {
        this.player = value;
    }

    /**
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecret(String value) {
        this.secret = value;
    }

}
