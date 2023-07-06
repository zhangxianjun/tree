package team.flint.tree.model.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户信息
 */
//@Getter
//@Setter
public class UserInfoVo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
