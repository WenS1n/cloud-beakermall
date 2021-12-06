package cn.vesns.beakermall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author wanwgei
 * @email i@weiwang.com
 * @date 2020-09-13 10:48:45
 *
 * @NotNull: CharSequence, Collection, Map 和 Array 对象不能是 null, 但可以是空集（size = 0）。
 * @NotEmpty: CharSequence, Collection, Map 和 Array 对象不能是 null 并且相关对象的 size 大于 0。
 * @NotBlank: String 不是 null 且 至少包含一个字符
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 *
	 * 新增品牌，不能指定id，数据库自增
	 * 修改品牌信息，必须指定id
	 */
	@TableId

	private Long brandId;
	/**
	 * 品牌名
	 */

	private String name;
	/**
	 * 品牌logo地址
	 */

	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */

	private Integer showStatus;
	/**
	 * 检索首字母
	 */

	private String firstLetter;
	/**
	 * 排序
	 */

	private Integer sort;

}
