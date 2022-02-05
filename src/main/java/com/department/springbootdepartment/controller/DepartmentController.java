package com.department.springbootdepartment.controller;

import com.department.springbootdepartment.entity.Department;
import com.department.springbootdepartment.service.DepartmentService;
import com.department.springbootdepartment.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    //    public DepartmentController(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }
//
//    public void setDepartmentService(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }

    @Autowired
    private DepartmentService departmentService;

    //@RequestMapping(value = "/departments", method = RequestMethod.POST)
    @PostMapping("/departments")//save yapmak icin post kullanilir
    public Department saveDepartment(@RequestBody Department department){ //nesneyi body ksiminda gonder demek

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deletedDepartmentById(departmentId);
        return "Deleted successfully";
    }

    @PutMapping("departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return  departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
