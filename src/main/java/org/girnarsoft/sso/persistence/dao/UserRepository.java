package org.girnarsoft.sso.persistence.dao;

import org.girnarsoft.sso.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);

}
