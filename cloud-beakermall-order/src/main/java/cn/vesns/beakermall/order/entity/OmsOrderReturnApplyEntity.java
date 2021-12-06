package cn.vesns.beakermall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?????˻????
 * 
 * @author vesns
 * @email 2865047755@gmail.com
 * @date 2021-12-06 19:13:34
 */
@Data
@TableName("oms_order_return_apply")
public class OmsOrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * ?˻???Ʒid
	 */
	private Long skuId;
	/**
	 * ???????
	 */
	private String orderSn;
	/**
	 * ????ʱ?
	 */
	private Date createTime;
	/**
	 * ??Ա?û??
	 */
	private String memberUsername;
	/**
	 * ?˿??
	 */
	private BigDecimal returnAmount;
	/**
	 * ?˻??????
	 */
	private String returnName;
	/**
	 * ?˻??˵绰
	 */
	private String returnPhone;
	/**
	 * ????״̬[0->????????1->?˻??У?2->?????ɣ?3->?Ѿܾ
	 */
	private Integer status;
	/**
	 * ????ʱ?
	 */
	private Date handleTime;
	/**
	 * ??ƷͼƬ
	 */
	private String skuImg;
	/**
	 * ??Ʒ?
	 */
	private String skuName;
	/**
	 * ??ƷƷ?
	 */
	private String skuBrand;
	/**
	 * ??Ʒ????????(JSON)
	 */
	private String skuAttrsVals;
	/**
	 * ?˻??
	 */
	private Integer skuCount;
	/**
	 * ??Ʒ???
	 */
	private BigDecimal skuPrice;
	/**
	 * ??Ʒʵ??֧?????
	 */
	private BigDecimal skuRealPrice;
	/**
	 * ԭ?
	 */
	private String reason;
	/**
	 * ???
	 */
	private String description;
	/**
	 * ƾ֤ͼƬ???Զ??Ÿ
	 */
	private String descPics;
	/**
	 * ??????ע
	 */
	private String handleNote;
	/**
	 * ??????Ա
	 */
	private String handleMan;
	/**
	 * ?ջ
	 */
	private String receiveMan;
	/**
	 * ?ջ?ʱ?
	 */
	private Date receiveTime;
	/**
	 * ?ջ???ע
	 */
	private String receiveNote;
	/**
	 * ?ջ??绰
	 */
	private String receivePhone;
	/**
	 * ??˾?ջ???ַ
	 */
	private String companyAddress;

}