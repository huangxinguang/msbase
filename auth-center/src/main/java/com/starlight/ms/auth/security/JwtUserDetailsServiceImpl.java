package com.starlight.ms.auth.security;

import com.starlight.ms.auth.dao.IUserRepository;
import com.starlight.ms.auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xghuang
 * @date 2018/12/17
 * @time 10:58
 * @desc:用户验证方法
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    private IUserRepository userRepository;

    @Autowired
    public JwtUserDetailsServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            List<String> roles = CollectionUtils.arrayToList(user.getRoles().split(","));
            return new JwtUser(user.getUsername(), user.getPassword(), roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
        }
    }

}
