package com.example.talabat3.category.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequestDto {
    private String refNo = UUID.randomUUID().toString();
    private String name;
}
