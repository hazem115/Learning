package com.example.crud.user.business.dto;

import com.example.crud.user.business.dto.request.CourseDtoRequest;
import com.example.crud.user.business.dto.response.CourseDtoResponse;
import com.example.crud.user.presistance.entity.Course;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T15:22:14+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDtoResponse entityToDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDtoResponse courseDtoResponse = new CourseDtoResponse();

        if ( course.getEmail() != null ) {
            courseDtoResponse.setEmail( course.getEmail() );
        }
        if ( course.getInstructor() != null ) {
            courseDtoResponse.setInstructor( course.getInstructor() );
        }

        return courseDtoResponse;
    }

    @Override
    public Course dtoToEntity(CourseDtoRequest request) {
        if ( request == null ) {
            return null;
        }

        Course course = new Course();

        if ( request.getId() != null ) {
            course.setId( request.getId() );
        }
        if ( request.getCourseName() != null ) {
            course.setCourseName( request.getCourseName() );
        }

        return course;
    }
}
