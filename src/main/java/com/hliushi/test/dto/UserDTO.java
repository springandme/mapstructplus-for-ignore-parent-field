package com.hliushi.test.dto;


import com.hliushi.test.common.dto.BaseDTO;
import com.hliushi.test.entity.User;
import io.github.linpeilie.annotations.AutoMapper;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.Objects;


@AutoMapper(target = User.class)
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;


    private String name;
    private Gender gender;
    private BigDecimal balance;
    private Long departmentId;
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

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
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
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(getName(), userDTO.getName()) && getGender() == userDTO.getGender() && Objects.equals(getBalance(), userDTO.getBalance()) && Objects.equals(getDepartmentId(), userDTO.getDepartmentId()) && Objects.equals(getBirthday(), userDTO.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getBalance(), getDepartmentId(), getBirthday());
    }
}