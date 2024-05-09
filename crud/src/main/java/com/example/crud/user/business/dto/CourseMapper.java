package com.example.crud.user.business.dto;

import com.example.crud.user.business.dto.request.CourseDtoRequest;
import com.example.crud.user.business.dto.response.CourseDtoResponse;
import com.example.crud.user.presistance.entity.Course;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CourseMapper {
    @Mappings({
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "instructor", target = "instructor")
    })
    CourseDtoResponse entityToDto(Course course);
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "courseName", target = "courseName")
    })
    Course dtoToEntity(CourseDtoRequest request);
}
