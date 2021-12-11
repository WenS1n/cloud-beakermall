package cn.vesns.beakermall.product.exception;/**
 * @version :JDK1.8
 * @date : 2021-12-11 0:45
 * @author : vip865047755@126.com
 * @File : BeakermallExceptionHandler.java
 * @software: IntelliJ IDEA
 */

import cn.vesns.common.exception.BizCodeEnum;
import cn.vesns.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: vesns vip865047755@126.com
 * @Title: BeakermallExceptionHandler
 * @ProjectName: cloud-beakermall
 * @Description:
 * @date: 2021-12-11 0:45
 *
 * 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "cn.vesns.beakermall.product.controller")
public class BeakermallExceptionControllerAdvice {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R HandlerValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出现异常{}，异常类型{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String,String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((item) -> {
            map.put(item.getField(),item.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(),BizCodeEnum.UNKNOWN_EXCEPTION.getMsg()).put("data",map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R HandleException(Throwable throwable) {
        log.error("错误：----->",throwable);
        
        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(),BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());

    }

}
