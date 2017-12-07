package com.lankydan.cassandra;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveCassandraRepository<Person, PersonKey> {

  Flux<Person> findByKeyFirstName(final String firstName);

  Mono<Person> findOneByKeyFirstName(final String firstName);
}
