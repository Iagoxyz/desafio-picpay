package tech.build.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.build.picpay.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}
