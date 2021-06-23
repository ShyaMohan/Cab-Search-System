package org.codejudge.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.codejudge.sb.model.DriverModel;

@Repository
public interface DriverRepository extends JpaRepository<DriverModel,Long>{

}
