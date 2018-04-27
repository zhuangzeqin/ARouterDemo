package rouder.demo.zzq.cn.eeepay.com.arouterdemo;

import java.io.Serializable;

/**
 * 描述：class describe
 * 作者：zhuangzeqin
 * 时间: 2018/4/24-13:57
 * 邮箱：zzq@eeepay.cn
 */
public class Test implements Serializable {
    private String fisrstName;

    public Test(String fisrstName, String lastName) {
        this.fisrstName = fisrstName;
        this.lastName = lastName;
    }

    public String getFisrstName() {
        return fisrstName;
    }

    public void setFisrstName(String fisrstName) {
        this.fisrstName = fisrstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    @Override
    public String toString() {
        return "Test{" +
                "fisrstName='" + fisrstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
