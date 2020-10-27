package com.seungmoo.querydsl.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * spring data JPA에서 findByFirstNameIngoreCaseAndLastNameStartsWithIgnoreCase 이렇게 method name이 과하게 길어지는 이슈가 있음
 * queryDsl을 사용해보자.
 */
public interface AccountRepository extends JpaRepository<Account, Long>, QuerydslPredicateExecutor<Account> {
}
