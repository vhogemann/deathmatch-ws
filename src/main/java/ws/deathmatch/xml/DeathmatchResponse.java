
package ws.deathmatch.xml;

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
 *         &lt;element name="player">
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "player"
})
public class DeathmatchResponse {

    @XmlElement(namespace = "http://deathmatch.ws/service", required = true)
    protected DeathmatchResponse.Player player;

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link DeathmatchResponse.Player }
     *     
     */
    public DeathmatchResponse.Player getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeathmatchResponse.Player }
     *     
     */
    public void setPlayer(DeathmatchResponse.Player value) {
        this.player = value;
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
