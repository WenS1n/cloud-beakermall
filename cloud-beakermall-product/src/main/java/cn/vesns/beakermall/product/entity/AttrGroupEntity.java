package cn.vesns.beakermall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ???Է??
 * 
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-06 17:51:12
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ???
	 */
	private String attrGroupName;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ???
	 */
	private String descript;
	/**
	 * ??ͼ?
	 */
	private String icon;
	/**
	 * ????????id
	 */
	private Long catelogId;

}
