package ddd.ddd.show.code.domain.core.entity;

import org.ddd.base.domain.DomainFactory;
import org.ddd.base.domain.Entity;
import org.ddd.base.domain.VO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import ddd.ddd.show.code.common.exception.DddShowCodeDomainException;
import ddd.ddd.show.code.common.exception.DddShowCodeSpiException;
import ddd.ddd.show.code.common.exception.Errors;
import ddd.ddd.show.code.domain.core.factory.OrderEntityFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * OrderEntity
 * !!!important 禁止直接注入该对象，强烈建议get方法
 * date 2019/4/6
 */
@Slf4j
@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OrderEntity implements Entity<String> {

  @Resource
  private OrderEntityFactory orderEntityFactory;

  public OrderEntity createOrder(VO showBuildVO) {
    try {
      //构造
      OrderEntity orderEntity = orderEntityFactory.perfect(null);
      //持久化 insert
      return orderEntity;
    } catch (DddShowCodeSpiException e) {
      throw new DddShowCodeDomainException(Errors.DEFAULT_PARAM_VALID_ERROR.getCode(),
                                           e.getMessage());
    } catch (DddShowCodeDomainException e) {
      throw e;
    } catch (Exception e) {
      throw new DddShowCodeDomainException(Errors.DEFAULT_PARAM_VALID_ERROR.getCode(),
                                           e.getMessage());
    }
  }

  public void insert() {
    //持久化
  }

  /**
   * 最简单的得到自己新的实例
   * 复杂的请使用Factory
   */
  public static final OrderEntity get() {
    return DomainFactory.get(OrderEntity.class);
  }

  @Override
  public String getUniqueId() {
    return null;
  }

}
