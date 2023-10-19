package com.example.backend.data.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KeywordDto {
    private Long id;
    private String value;
}