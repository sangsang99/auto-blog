package com.sangsang.autoblog.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommomResponseDTO {
    Long resultCode;
    String resultMessage;
}
