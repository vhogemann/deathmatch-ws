//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.27 at 11:31:54 AM BRST 
//


package ws.deathmatch.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeathmatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeathmatchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="player" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="coords">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="direction" type="{http://deathmatch.ws/service}DirectionEnum"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeathmatchResponse", namespace = "http://deathmatch.ws/service", propOrder = {
    "player",
    "error"
})
public class DeathmatchResponse {

    @XmlElement(namespace = "http://deathmatch.ws/service")
    protected List<DeathmatchResponse.Player> player;
    @XmlElement(namespace = "http://deathmatch.ws/service")
    protected String error;

    /**
     * Gets the value of the player property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the player property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeathmatchResponse.Player }
     * 
     * 
     */
    public List<DeathmatchResponse.Player> getPlayer() {
        if (player == null) {
            player = new ArrayList<DeathmatchResponse.Player>();
        }
        return this.player;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="coords">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="direction" type="{http://deathmatch.ws/service}DirectionEnum"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "coords",
        "direction"
    })
    public static class Player {

        @XmlElement(namespace = "http://deathmatch.ws/service", required = true)
        protected DeathmatchResponse.Player.Coords coords;
        @XmlElement(namespace = "http://deathmatch.ws/service", required = true)
        protected DirectionEnum direction;
        @XmlAttribute(name = "id", required = true)
        protected int id;
        @XmlAttribute(name = "secret")
        protected String secret;

        /**
         * Gets the value of the coords property.
         * 
         * @return
         *     possible object is
         *     {@link DeathmatchResponse.Player.Coords }
         *     
         */
        public DeathmatchResponse.Player.Coords getCoords() {
            return coords;
        }

        /**
         * Sets the value of the coords property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeathmatchResponse.Player.Coords }
         *     
         */
        public void setCoords(DeathmatchResponse.Player.Coords value) {
            this.coords = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link DirectionEnum }
         *     
         */
        public DirectionEnum getDirection() {
            return direction;
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectionEnum }
         *     
         */
        public void setDirection(DirectionEnum value) {
            this.direction = value;
        }

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Coords {

            @XmlAttribute(name = "x")
            protected Integer x;
            @XmlAttribute(name = "y")
            protected Integer y;

            /**
             * Gets the value of the x property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getX() {
                return x;
            }

            /**
             * Sets the value of the x property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setX(Integer value) {
                this.x = value;
            }

            /**
             * Gets the value of the y property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getY() {
                return y;
            }

            /**
             * Sets the value of the y property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setY(Integer value) {
                this.y = value;
            }

        }

    }

}
