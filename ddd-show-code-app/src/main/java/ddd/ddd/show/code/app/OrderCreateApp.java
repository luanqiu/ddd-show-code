package ddd.ddd.show.code.app;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import ddd.base.domain.Application;
import ddd.ddd.show.code.api.common.dto.BaseResponseDTO;
import ddd.ddd.show.code.api.common.dto.OrderRequestDTO;
import ddd.ddd.show.code.domain.core.service.impl.SplitOrderServiceImpl;
import ddd.ddd.show.code.domain.core.vo.OrderCreateVO;

/**
 * OrderCreateApp
 * author  wenhe
 */
@Component
public class OrderCreateApp implements Application<OrderRequestDTO, BaseResponseDTO> {

  @Resource
  private SplitOrderServiceImpl splitOrderServiceImpl;

  @Override
  public BaseResponseDTO doAction(OrderRequestDTO request) {
    //step 0 参数校验
    //step 1 拆单
    splitOrderServiceImpl.splitOrder(new OrderCreateVO(request.getShopId()));
    //step 2 for 循环生成多个订单
    return null;
  }


//  @Override
//  public BaseResponseDTO doAction(OrderRequestDTO request) {
//    //step 0 参数校验
//    //step 1 拆单
//    //如果是零售A商家
//    if (StringUtils.equals(request.getShopId(), "A")) {
//      splitOrderServiceImpl.splitSignelOrder();
//    } else {
//      //其余商家正常逻辑
//      splitOrderServiceImpl.splitOrder();
//    }
//    //step 2 for 循环生成多个订单
//    return null;
//  }

}
