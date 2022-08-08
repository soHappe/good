package com.example.springboot_test_quick;

/**
 * 接口层:负责逻辑处理访问数据库层
 */
public interface UserService {
    /**
     * 保存 user 对象
     *
     * @param user
     * @return
     */
    Result saveUser(User user);

    /**
     * 查询所有user
     *
     * @return
     */
    Result queryAll();

    /**
     * 通过name和age查询
     *
     * @param name
     * @param age
     * @return
     */
    Result getByNameAndAge(String name, int age);
}


