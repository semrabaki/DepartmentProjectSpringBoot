package com.department.springbootdepartment.repository;

import com.department.springbootdepartment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //@Query("Select ...")
    public Department findByDepartmentName(String departmentName);
}
