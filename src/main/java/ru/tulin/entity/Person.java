package ru.tulin.entity;

import ru.tulin.enums.My;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "person")
@XmlType(propOrder = {"name","age","my","friends"})
public class Person {
    private String name;
    private int age;
    private List<Person> friends;
    private My my;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getFriends() {
        return friends;
    }

    @XmlElement(name = "friend")
    @XmlElementWrapper
    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public My getMy() {
        return my;
    }

    @XmlElement(name = "my",required = true)
    public void setMy(My my) {
        this.my = my;
    }

    @Override
    public String toString() {
        String res = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + ", friends{";
        if(friends != null){
            for(Person p : friends){
                res += p.toString();
            }
        }
        res += "}}";
        return res;
    }
}
