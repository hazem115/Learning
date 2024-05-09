package com.example.talabat.category.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryRequestDto {
    private long id;
    private String categoryName;
    private String refNo = UUID.randomUUID().toString();

}
