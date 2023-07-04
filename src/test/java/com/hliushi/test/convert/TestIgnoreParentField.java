package com.hliushi.test.convert;

import com.hliushi.test.dto.Gender;
import com.hliushi.test.dto.UserDTO;
import com.hliushi.test.entity.User;
import io.github.linpeilie.Converter;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

/**
 * @author: hliushi
 * @date: 2023/7/4 10:32
 **/
public class TestIgnoreParentField {

    public static final String SYSTEM_ADMIN_USER = "SYSTEM_ADMIN_USER";
    private static Converter converter = new Converter();


    private User mockSearchUserFromDB() {
        User user = new User();
        user.setName("张三");
        user.setGender(Gender.MALE);
        user.setBalance(BigDecimal.TEN);
        user.setBirthday(LocalDate.parse("1988-12-31"));
        user.setVersion(1L);
        user.setCreateTime(DateTime.now());
        user.setCreateUserId(SYSTEM_ADMIN_USER);
        user.setBizDisabled(false);
        user.setUpdateTime(DateTime.now());
        user.setUpdateUserId(SYSTEM_ADMIN_USER);
        user.setId(24321L);
        return user;
    }

    @Test
    public void testMappingUpdateInfo() {
        // mock from db
        User user = this.mockSearchUserFromDB();

        // convert dto
        UserDTO userDTO = converter.convert(user, UserDTO.class);

        // update user info
        userDTO.setId(100001L);
        userDTO.setUpdateUserId("NORMAL_USER");
        userDTO.setBalance(BigDecimal.ZERO);

        // userDTO -> user
        user = converter.convert(userDTO, user);

        // expected equal
        Assert.assertEquals(user.getBalance(), BigDecimal.ZERO);
        Assert.assertEquals(user.getBalance(), userDTO.getBalance());

        // expected not equal
        // Assert.assertNotEquals(user.getId(), userDTO.getId(), "校验失败，DTO -> BO 忽略 ID 映射，期望 BO.ID = 24321，但是被映射为 10000 \n");
        Assert.assertNotEquals(user.getUpdateUserId(), userDTO.getUpdateUserId(), "校验失败，DTO -> BO 忽略 updateUserId 映射，期望 BO.updateUserId = SYSTEM_ADMIN_USER，但是被映射为 NORMAL_USER \n");
    }

}
