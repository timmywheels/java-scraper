package com.timwheeler.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins="http://localhost:4200")
interface FinancialSnapshotRepository extends JpaRepository<FinancialSnapshot, Long>{

}