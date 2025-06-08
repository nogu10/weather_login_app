package com.example.weatherapp.repository;

import com.example.weatherapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ユーザー情報を管理するためのリポジトリインターフェースです。
 * <p>
 * {@link JpaRepository} を継承しており、標準的な CRUD 操作に加えて、
 * ユーザー名による検索メソッドを提供します。
 * </p>
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 指定されたユーザー名に一致する {@link User} を返します。
     *
     * @param username 検索対象のユーザー名
     * @return ユーザー名に一致する {@link User}、存在しない場合は {@code null}
     */
    User findByUsername(String username);
}
