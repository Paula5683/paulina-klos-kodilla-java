package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public CompanyFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchEmployeeWithNameFragment(String string) throws SearchingException{
        LOGGER.info("Searching for Employee with: "+ string + " in name");

        List<Employee> retrievedList = employeeDao.retrieveEmployeeWithNameLike(string);
        if(!retrievedList.isEmpty()){
            LOGGER.info("Found Employee:");
            retrievedList.stream()
                    .map(Employee::getLastName)
                    .forEach(System.out::println);
        } else {
            throw new SearchingException(SearchingException.EMPLOYEE_NOT_FOUND);
        }
        return retrievedList;
    }

    public List<Company> searchCompanyWithFragment(String string) throws SearchingException{
        LOGGER.info("Searching for Company with: "+ string + " in name");

        List<Company> retrievedList = companyDao.retrieveCompanyWithFragment(string);
        if(!retrievedList.isEmpty()){
            LOGGER.info("Found Company:");
            retrievedList.stream()
                    .map(Company::getName)
                    .forEach(System.out::println);
        } else {
            throw new SearchingException(SearchingException.COMPANY_NOT_FOUND);
        }
        return retrievedList;
    }
}
