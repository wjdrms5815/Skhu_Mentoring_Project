package com.SkhuMentoring.dto;

import lombok.Data;

@Data
public class User {
    private Long bno;
    private String userId;
    private String userPw;
    private Long userStudentNum;
    private String userEmail;
    private String userPhoneNum;
}