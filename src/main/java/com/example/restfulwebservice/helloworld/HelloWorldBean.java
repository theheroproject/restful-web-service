package com.example.restfulwebservice.helloworld;
// lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {
    private String message;

    // lombok 사용시 get,set,생성자가 필요없다.
/*    public String getMessage(){
        return this.message;
    }
    public void setmessage(){
        this.message = msg;
    }*/
    // 생성자 작성 불필요
//    public HelloWorldBean(String message) {
//         this.message=message;
//    }

}
