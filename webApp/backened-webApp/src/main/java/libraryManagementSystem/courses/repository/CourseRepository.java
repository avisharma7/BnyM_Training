package libraryManagementSystem.courses.repository;

import libraryManagementSystem.courses.bean.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Books, Long> {
}
