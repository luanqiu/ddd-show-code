package ddd.ddd.show.code.domain.core.vo;

import ddd.base.domain.VO;
import lombok.Getter;
import lombok.Setter;

/**
 * OrderCreateVO
 * author  wenhe
 * date 2019/5/25
 */
@Getter
@Setter
public class OrderCreateVO implements VO {

  private static final long serialVersionUID = -15674704679585376L;

  public OrderCreateVO(String shopId) {
    this.shopId = shopId;
  }

  public String shopId;
}
