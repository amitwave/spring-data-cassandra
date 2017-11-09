package com.lankydan.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@NoRepositoryBean
public interface PersonRepository extends CassandraRepository<Person, PersonKey> {

  List<Person> findByKeyFirstName(final String firstName);

  List<Person> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(
      final String firstName, final LocalDateTime dateOfBirth);
}
