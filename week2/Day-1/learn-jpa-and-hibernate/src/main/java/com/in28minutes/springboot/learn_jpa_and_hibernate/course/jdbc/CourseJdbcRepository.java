package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.courses.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY1 =
            "INSERT INTO course (id, name, author) VALUES (?, ?, ?)";

    private static final String DELETE_QUERY =
            "DELETE FROM course WHERE id = ?";

    private static final String READ_QUERY =
            "SELECT * FROM course WHERE id = ?";

    // INSERT
    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY1,
                course.getId(), course.getName(), course.getAuthor());
    }

    // DELETE
    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    // READ -> RETRIEVE SOME DATA FROM THE DATABASE
    public Course findById(long id) {
        try {
            return springJdbcTemplate.queryForObject(READ_QUERY,
                    new BeanPropertyRowMapper<>(Course.class), id);
        } catch (Exception e) {
            // Handle the case when no course is found (e.g., return null or throw a custom exception)
            System.out.println("Course with id " + id + " not found.");
            return null;
        }
    }
}
