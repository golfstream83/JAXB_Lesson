package ru.tulin.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum(String.class)
@XmlType(name = "my")
public enum My {
    @XmlEnumValue("Oleg")
    Oleg,
    @XmlEnumValue("Misha")
    Misha;

    public String value(){
        return name();
    }

    public static My fromValue(String v) {
        return valueOf(v);
    }
}
