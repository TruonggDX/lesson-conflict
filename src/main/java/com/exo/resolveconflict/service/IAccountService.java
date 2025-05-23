package com.exo.resolveconflict.service;

import com.exo.resolveconflict.entity.AccountEntity;
import java.util.List;
import java.util.Optional;

public interface IAccountService {

  List<AccountEntity> findAll();

  Optional<AccountEntity> findById(Long id);

  AccountEntity save(AccountEntity account);

  void deleteById(Long id);
}
