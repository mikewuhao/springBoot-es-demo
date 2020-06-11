package com.wuhao.repository;

import com.wuhao.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User, Long> {

    public List<User> findByUserNameLike(String userName);
}
