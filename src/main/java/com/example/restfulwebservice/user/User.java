package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value={"password"})
@JsonFilter("UserInfo")
public class User {
    private Integer id;

    @Size(min=2,message = "Name은 2글자 이상 입력해 주세요.")
    private String name;
    @Past
    private Date joinDate;
    //lombok 사용

    //외부에 노출시키고 싶지 않은 값에 @JsonIgnore 을 추가한다.
    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;
}
