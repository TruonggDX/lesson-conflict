package com.exo.resolveconflict.repository;

import com.exo.resolveconflict.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
  // Bạn có thể thêm các query method nếu muốn
}