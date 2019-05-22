package ddd.ddd.show.code.domain.core.aggr;

import ddd.base.domain.Aggr;

import ddd.ddd.show.code.domain.core.entity.OrderEntity;
import ddd.ddd.show.code.domain.core.entity.OrderGoodsEntity;

/**
 * 订单聚合
 * 演示聚合的粒度，错误的示范
 * author  wenhe
 * date 2019/5/20
 */
public class OrderAggr implements Aggr<OrderEntity> {

  private OrderEntity orderEntity;

  private OrderGoodsEntity orderItemEntity;

  @Override
  public OrderEntity getAggrRoot() {
    return orderEntity;
  }

  public void changePriceByOrder() {
    // 订单改价逻辑
  }

  public void disCountByOrder() {
    // 订单优惠逻辑
  }

}
