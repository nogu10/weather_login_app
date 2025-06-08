package com.example.weatherapp.model;

import jakarta.persistence.*;

/**
 * ユーザー情報を表すエンティティクラスです。
 * <p>
 * このクラスはデータベースの {@code User} テーブルにマッピングされ、
 * ユーザーのID、ユーザー名、パスワードを保持します。
 * </p>
 */
@Entity
public class User {

    /**
     * 主キー。自動採番されるユーザーID。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ユーザー名。
     */
    private String username;

    /**
     * ハッシュ化されたパスワード。
     */
    private String password;

    /**
     * ユーザーIDを取得します。
     *
     * @return ユーザーID
     */
    public Long getId() {
        return id;
    }

    /**
     * ユーザーIDを設定します。
     *
     * @param id ユーザーID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ユーザー名を取得します。
     *
     * @return ユーザー名
     */
    public String getUsername() {
        return username;
    }

    /**
     * ユーザー名を設定します。
     *
     * @param username ユーザー名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * パスワードを取得します。
     *
     * @return パスワード（ハッシュ化されていることが望ましい）
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを設定します。
     *
     * @param password パスワード（保存前にハッシュ化することを推奨）
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
