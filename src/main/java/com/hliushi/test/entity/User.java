package com.hliushi.test.entity;

/**
 * @author: hliushi
 * @date: 2023/3/2 22:24
 **/

import com.hliushi.test.common.bo.BOBase;
import com.hliushi.test.dto.Gender;
import com.hliushi.test.dto.UserDTO;
import io.github.linpeilie.annotations.AutoMapper;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.Objects;


@AutoMapper(target = UserDTO.class)
public class User extends BOBase {

    private static final long serialVersionUID = 1L;

    private String name;

    private Gender gender;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    private LocalDate birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) && getGender() == user.getGender() && Objects.equals(getBalance(), user.getBalance()) && Objects.equals(getBirthday(), user.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getBalance(), getBirthday());
    }
}