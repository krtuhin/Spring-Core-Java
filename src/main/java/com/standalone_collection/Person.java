package com.standalone_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

    private List<String> friends;
    private Map<String, String> course;
    private Properties properties;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" + "friends=" + friends + ", course=" + course + ", properties=" + properties + '}';
    }
}
