package com.study.event.api.event.dto.response;

import lombok.*;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {

    private String email;
    private String role; // 권한 정보
    private String token; // 인증 토큰
}
