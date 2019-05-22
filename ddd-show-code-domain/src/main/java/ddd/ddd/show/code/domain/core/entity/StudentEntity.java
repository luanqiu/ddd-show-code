package ddd.ddd.show.code.domain.core.entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

import ddd.base.domain.DomainFactory;
import ddd.base.domain.Entity;
import ddd.base.domain.VO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * StudentEntity
 * !!!important 禁止直接注入该对象，强烈建议get方法
 * date 2019/4/6
 */
@Slf4j
@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentEntity implements Entity<String> {

  public StudentEntity createStudent(VO vo) {
    return null;
  }

  public void insert() {
    //持久化
  }

  /**
   * 最简单的得到自己新的实例
   * 复杂的请使用Factory
   */
  public static final StudentEntity get() {
    return DomainFactory.get(StudentEntity.class);
  }

  @Override
  public String getUniqueId() {
    return null;
  }

  public void batchCreate(List<CourceEntity> cources) {

  }

  public  StudentEntity getByCode(String aggrRoot) {
    return null;
  }
}
