//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.27 at 11:31:54 AM BRST 
//


package ws.deathmatch.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommandEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="DOWN"/>
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="WALK"/>
 *     &lt;enumeration value="SHOOT"/>
 *     &lt;enumeration value="INSERTCOIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommandEnum", namespace = "http://deathmatch.ws/service")
@XmlEnum
public enum CommandEnum {

    UP,
    DOWN,
    LEFT,
    RIGHT,
    WALK,
    SHOOT,
    INSERTCOIN;

    public String value() {
        return name();
    }

    public static CommandEnum fromValue(String v) {
        return valueOf(v);
    }

}
