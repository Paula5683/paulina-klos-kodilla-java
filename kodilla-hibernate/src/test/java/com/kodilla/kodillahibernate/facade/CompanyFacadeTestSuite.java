package com.kodilla.kodillahibernate.facade;


import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import com.kodilla.kodillahibernate.manytomany.facade.CompanyFacade;
import com.kodilla.kodillahibernate.manytomany.facade.SearchingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @BeforeEach
    public void cleanDataBase(){
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }

    @Test
    void searchEmployeeWithNameFragment(){
        //Given
        employeeDao.save(new Employee("Jan", "Kowalski"));
        employeeDao.save(new Employee("Ewelina", "Kowal"));
        employeeDao.save(new Employee("Marek", "Nowak"));
        //When
        List<Employee> employees = new ArrayList<>();
        try {
            employees = companyFacade.searchEmployeeWithNameFragment("Kow");
        } catch (SearchingException e){
        }
        //Then
        assertEquals(2, employees.size());
    }
    @Test
    void searchCompanyWithFragment() {
        //Given
        Company company = new Company("Blue Company");
        Company company1 = new Company("Yellow Company");
        Company company2 = new Company("Black Company");
        //When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);

        //Then
        List<Company> companies = new ArrayList<>();
        try {
            companies = companyFacade.searchCompanyWithFragment("low");
        } catch (SearchingException e) {

        }
        assertEquals(1, companies.size());
    }
}
