package com.ntg.organization.organization.service;

import com.ntg.organization.organization.entity.Department;
import com.ntg.organization.organization.entity.Employee;
import com.ntg.organization.organization.respository.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementService {
    @Autowired
    DepartementRepo departementRepo;

    public Department linkDeptToEmp(Department department) {
        departementRepo.save(department);
        return department;
    }
}