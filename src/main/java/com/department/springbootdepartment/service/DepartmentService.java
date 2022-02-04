package com.department.springbootdepartment.service;

import com.department.springbootdepartment.entity.Department;

import java.util.List;


public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deletedDepartmentById(Long departmentId);
}