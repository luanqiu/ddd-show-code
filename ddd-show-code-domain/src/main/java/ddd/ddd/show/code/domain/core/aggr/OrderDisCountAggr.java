package ddd.ddd.show.code.domain.core.aggr;

import ddd.base.domain.Aggr;

/**
 * OrderDisCountAggr
 * author  文贺
 * date 2019/5/21
 */
public class OrderDisCountAggr implements Aggr<String> {

  /**
   * 被改价的订单号
   */
  private String orderId;

  /**
   * 被改价的商品号
   */
  private String orderGoodsId;

  @Override
  public String getAggrRoot() {
    return orderId;
  }

  //订单优惠，导致订单价格和商品价格的变化
  public void disCountByOrder() {
    // domesomgthing
  }


}
