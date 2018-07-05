package io.pivotal.directoryservice.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.directoryservice.domain.Directory;

public interface DirectoryRepository extends CrudRepository<Directory, Long> {

}
