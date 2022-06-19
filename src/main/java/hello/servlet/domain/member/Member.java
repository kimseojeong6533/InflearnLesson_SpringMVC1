package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Domain(Entity)에 해당하는 부분 - DB 테이블과 1:1 매칭됨
 */
public class Member {
    private Long id;
    private String userName;
    private int age;

    // 기본 생성자
    public Member(){

    }

    // 생성자
    public Member(String userName, int age){
        this.userName = userName;
        this.age = age;
    }

}
