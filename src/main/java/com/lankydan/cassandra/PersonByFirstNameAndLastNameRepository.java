package com.lankydan.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersonByFirstNameAndLastNameRepository extends CassandraRepository<PersonByFirstNameAndLastName, PersonByFirstNameAndLastNameKey> {

  List<PersonByFirstNameAndLastName> findByKeyFirstNameAndKeyLastName(final String firstName, final String lastName);

  List<PersonByFirstNameAndLastName> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(
      final String firstName, final LocalDateTime dateOfBirth);

  @Query(allowFiltering = true)
  List<PersonByFirstNameAndLastName> findByCity(final String city);
}
