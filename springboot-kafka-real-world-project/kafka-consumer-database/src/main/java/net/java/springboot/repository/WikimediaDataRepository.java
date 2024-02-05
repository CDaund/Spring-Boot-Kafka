package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long>{

}
