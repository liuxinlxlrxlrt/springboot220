package com.sxt.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.*;

@PropertySource(value ={"classpath:person.properties"} )
@Component //<bean id ="student" class="com.sxt.domain.Student"></bean>
@ConfigurationProperties(prefix = "person") //设置属性
public class Person {

    private Integer id;
    private String name;
    private String[] hobbys;
    private List<String> lists;
    private Map<String,String> maps;
    private Set<String> sets;
    private Integer age;
    private Date birthday;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbys=" + Arrays.toString(hobbys) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", sets=" + sets +
                ", age=" + age +
                ", birthday=" + birthday +
                ", userName='" + userName + '\'' +
                '}';
    }
}
