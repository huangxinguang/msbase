package com.starlight.ms.auth.dao;

import com.starlight.ms.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xghuang
 * @date 2018/12/17
 * @time 10:54
 * @desc:
 */
public interface IUserRepository extends JpaRepository<User, String> {

    /**
     * 通过用户名查找用户
     *
     * @param username 用户名
     * @return 用户信息
     */
    User findByUsername(String username);

}
