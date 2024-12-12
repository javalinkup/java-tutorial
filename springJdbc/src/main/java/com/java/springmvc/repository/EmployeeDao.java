package com.java.springmvc.repository;

import com.java.springmvc.model.Employee;
import com.java.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate  jdbcTemplate;

    public int saveEmployee(Employee e){
        String query = "insert into USERS (name,email) values (?,?)";
        return jdbcTemplate.update(query, e.getName(), e.getEmail());
    }

    public List<Employee> getAllEMps() {
        String query  = "select * from USERS";

        return jdbcTemplate.query(query, (rs, rowNum) -> {
            Employee em = new Employee();
            em.setId(rs.getLong("id"));
            em.setName(rs.getString("name"));
            em.setEmail(rs.getString("email"));
            return em;
        });

    }


    public Employee getAllEMpsById(Long id) {
        String query  = "select * from USERS where id=?";

        return jdbcTemplate.queryForObject(query, new Object[]{id},(rs, rowNum) -> {
            Employee em = new Employee();
            em.setId(rs.getLong("id"));
            em.setName(rs.getString("name"));
            em.setEmail(rs.getString("email"));
            return em;
        });

    }
}
