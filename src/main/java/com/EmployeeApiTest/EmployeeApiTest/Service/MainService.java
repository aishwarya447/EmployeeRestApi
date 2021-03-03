package main.java.com.EmployeeApiTest.EmployeeApiTest.Service;

import main.java.com.EmployeeApiTest.EmployeeApiTest.Dao.MainDao;
import main.java.com.EmployeeApiTest.EmployeeApiTest.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    MainDao mainDao;

    public List<Employee> getAllDetails(){
        return mainDao.getEmployeeList();
    }

    public void saveEmployee(String email, String name){
        mainDao.saveEmployee(email, name);
    }

}
