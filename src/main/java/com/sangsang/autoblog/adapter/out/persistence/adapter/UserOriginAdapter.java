package com.sangsang.autoblog.adapter.out.persistence.adapter;

import org.springframework.stereotype.Repository;

import com.sangsang.autoblog.domain.model.User;
import com.sangsang.autoblog.domain.port.out.UserOriginRepositoryPort;

@Repository
public class UserOriginAdapter implements UserOriginRepositoryPort {
    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findByUserName(String userName) {
        // TODO Auto-generated method stub
        return null;
    }
}
