package cn.vesns.common.valid;/**
 * @version :JDK1.8
 * @date : 2021-12-11 1:49
 * @author : vip865047755@126.com
 * @File : ListValueConstrainValidator.java
 * @software: IntelliJ IDEA
 */

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: vesns vip865047755@126.com
 * @Title: ListValueConstrainValidator
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-11 1:49
 */
public class ListValueConstrainValidator implements ConstraintValidator<ListValue,Integer> {


    private Set<Integer> set = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        if (values.length > 0) {
            for (int value : values) {
                set.add(value);
            }
        }

    }

    /**
     * 判断是否校验成功
     * @param integer 需要校验的值
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(integer);
    }
}
