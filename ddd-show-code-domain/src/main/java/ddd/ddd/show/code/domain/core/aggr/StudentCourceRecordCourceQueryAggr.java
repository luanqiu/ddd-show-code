package ddd.ddd.show.code.domain.core.aggr;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import ddd.base.domain.Aggr;
import ddd.ddd.show.code.domain.core.entity.CourceEntity;
import ddd.ddd.show.code.domain.core.entity.CourceRecordEntity;
import ddd.ddd.show.code.domain.core.entity.StudentEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询学生选修课下的所有课程
 * author  wenhe
 * date 2019/5/22
 */
@Setter
@Getter
@Component
public class StudentCourceRecordCourceQueryAggr implements Aggr<StudentEntity> {

  private StudentEntity studentEntity;

  @Override
  public StudentEntity getAggrRoot() {
    return studentEntity;
  }

  /**
   * 我们的目标是查询学生选修课下的所有老师
   * 但这里的返回是课程，其实就是想把查询接口的能力粒度开大一点，让 app 层去选择自己需要什么
   */
  public List<CourceEntity> queryCourceEntityByStudent() {
    List<CourceRecordEntity>
        courceRecordEntities =
        CourceRecordEntity.get().getByStudentCode(getAggrRoot().getUniqueId());

    List<CourceEntity>
        cources =
        CourceEntity.get()
            .getByCodes(courceRecordEntities.stream().map(CourceRecordEntity::getUniqueId).collect(
                Collectors.toList()));

    return cources;
  }
}
