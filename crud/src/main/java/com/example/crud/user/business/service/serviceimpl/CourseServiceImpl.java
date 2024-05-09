package com.example.crud.user.business.service.serviceimpl;

import com.example.crud.user.business.dto.CourseMapper;
import com.example.crud.user.business.service.services.CourseService;
import com.example.crud.user.presistance.entity.Course;
import com.example.crud.user.presistance.repo.CourseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepo courseRepo;
    private CourseMapper courseMapper;


}
