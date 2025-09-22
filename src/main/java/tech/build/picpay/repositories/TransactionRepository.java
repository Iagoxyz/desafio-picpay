package tech.build.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.build.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
