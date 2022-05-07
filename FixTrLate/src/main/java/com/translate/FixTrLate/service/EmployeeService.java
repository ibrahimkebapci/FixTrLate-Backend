package com.translate.FixTrLate.service;

import com.translate.FixTrLate.exception.UserNotFoundException;
import com.translate.FixTrLate.model.Employee;
import com.translate.FixTrLate.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService (EmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee (Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
      return employeeRepo.save(employee);
        //yeni bir işe eklemek için kullanacağımız fonksiyon
    }
    public List<Employee> findAllEmployees(){

        return employeeRepo.findAll();
        //oluşturmuş olduğumuz işlerimizi bulmamıza yararlar
    }
    public  Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() ->new UserNotFoundException("User by id" + id +"was not found"));
        //id sine göre bulma işlemi yapabilmek için kullandığ
    }
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id); //id sine göre silme işlemi için
    }
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee); //update yapabilmek için
    }

}

