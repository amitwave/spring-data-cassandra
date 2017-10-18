package com.lankydan.cassandra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

// @Configuration
// @EnableCassandraRepositories
public abstract class CassandraConfig extends AbstractCassandraConfiguration {

  @Value("${cassandra.contactpoints}")
  private String contactPoints;

  @Value("${cassandra.port}")
  private int port;

  // @Value("${cassandra.keyspace}")
  // private String keySpace;

  @Value("${cassandra.entitypackage}")
  private String entityPackage;

  // @Override
  // protected String getKeyspaceName() {
  //   return keySpace;
  // }

  @Override
  protected String getContactPoints() {
    return contactPoints;
  }

  @Override
  protected int getPort() {
    return port;
  }

  @Override
  public SchemaAction getSchemaAction() {
    return SchemaAction.CREATE_IF_NOT_EXISTS;
  }

  // @Override
  // public String[] getEntityBasePackages() {
  //   return new String[] {entityPackage};
  // }
}