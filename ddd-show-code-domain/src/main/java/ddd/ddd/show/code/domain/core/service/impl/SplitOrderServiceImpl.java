package ddd.ddd.show.code.domain.core.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import ddd.base.domain.DomainService;
import ddd.ddd.show.code.domain.core.vo.OrderCreateVO;

/**
 * 拆单
 * author  wenhe
 */
@Service
public class SplitOrderServiceImpl implements DomainService {

  //根据商品和订单纬度拆单(后来修改版本)
  public boolean splitOrder(OrderCreateVO vo) {
    if (StringUtils.equals(vo.getShopId(), "A")) {
      return splitSignelOrder();
    }
    //其余商家正常逻辑
    return true;
  }

  //根据商品和订单纬度拆单
  public boolean splitOrder() {
    return true;
  }

  //订单下面只有一个商品
  public boolean splitSignelOrder() {
    return true;
  }

}
