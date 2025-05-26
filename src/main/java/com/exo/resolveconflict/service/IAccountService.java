package com.exo.resolveconflict.service;

import com.exo.resolveconflict.entity.AccountEntity;
import java.util.List;
import java.util.Optional;

public interface IAccountService {

  //get all account
  List<AccountEntity> findAll();

  //findby account by id
  Optional<AccountEntity> findById(Long id);

  //save account
  AccountEntity save(AccountEntity account);

  //delete account by id
  void deleteById(Long id);

  AccountEntity getById(Long id);
}
