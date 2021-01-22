package com.lankydan.cassandra;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("people_by_first_name_last_name")
public class PersonByFirstNameAndLastName {

  @PrimaryKey
  private PersonByFirstNameAndLastNameKey key;

  @Column("city")
  private String city;

  @Column private double salary;

  public PersonByFirstNameAndLastName(final PersonByFirstNameAndLastNameKey key, final String city, final double salary) {
    this.key = key;
    this.city = city;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Person{" + "key=" + key + ", lastName='" + city + '\'' + ", salary=" + salary + '}';
  }

  public PersonByFirstNameAndLastNameKey getKey() {
    return key;
  }

  public void setKey(PersonByFirstNameAndLastNameKey key) {
    this.key = key;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
