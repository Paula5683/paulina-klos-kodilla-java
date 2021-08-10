package com.kodilla.kodillahibernate.manytomany.dao;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky =new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarkson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        }catch (Exception e){
            //do nothing
        }
    }

    @Test
    void testEmployeeNamedQueries(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky =new Employee("Linda", "Kovalsky");
        Employee kateSmith = new Employee("Kate", "Smith");

        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarkson);
        softwareMachine.getEmployees().add(lindaKovalsky);
        softwareMachine.getEmployees().add(kateSmith);

        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarkson.getCompanies().add(softwareMachine);
        lindaKovalsky.getCompanies().add(softwareMachine);
        kateSmith.getCompanies().add(softwareMachine);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        //When
        List<Employee> lastNameList = employeeDao.retrieveLastName("Smith");

        //Then
        assertEquals(2, lastNameList.size());

        //CleanUp
        companyDao.deleteById(softwareMachineId);
    }

    @Test
    void testCompanyNamedQueries() {
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company greyMatter = new Company("Grey Matter");
        Company softSocks = new Company("Soft Socks");
        Company softBall = new Company("SoftBall");

        softwareMachine.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(johnSmith);
        softSocks.getEmployees().add(johnSmith);
        softBall.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(softBall);
        johnSmith.getCompanies().add(softSocks);
        johnSmith.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(softSocks);
        int softSocksId = softSocks.getId();
        companyDao.save(softBall);
        int softBallId = softBall.getId();

        //When
        List<Company> companyList = companyDao.retrieveCompanyName();

        //Then
        assertEquals(3, companyList.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(softSocksId);
            companyDao.deleteById(greyMatterId);
            companyDao.deleteById(softBallId);
        } catch (Exception e) {
            //do nothing
        }

    }
}
