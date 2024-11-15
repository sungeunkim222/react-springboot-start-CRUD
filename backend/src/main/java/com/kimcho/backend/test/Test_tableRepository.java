package com.kimcho.backend.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test_tableRepository extends JpaRepository<Test_table, Integer> {

}
