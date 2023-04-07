package in.vini.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vini.entity.Course;

public interface CourseRepository  extends JpaRepository<Course, Serializable>{

}
