package com.exo.resolveconflict.service.impl;

import com.exo.resolveconflict.entity.AccountEntity;
import com.exo.resolveconflict.repository.AccountRepository;
import com.exo.resolveconflict.service.IAccountService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private final AccountRepository accountRepository;

  @Override
  public List<AccountEntity> findAll() {
    return accountRepository.findAll();
  }

  @Override
  public Optional<AccountEntity> findById(Long id) {
    return accountRepository.findById(id);
  }

  @Override
  public AccountEntity save(AccountEntity account) {
    return accountRepository.save(account);
  }

  @Override
  public void deleteById(Long id) {
    accountRepository.deleteById(id);
  }
}
