package com.ntg.organization.organization.respository;

import com.ntg.organization.organization.entity.Department;
import com.ntg.organization.organization.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DepartementRepo extends CrudRepository<Department, Long> {

}
