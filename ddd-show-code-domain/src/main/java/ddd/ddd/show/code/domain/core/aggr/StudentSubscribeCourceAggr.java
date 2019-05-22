package ddd.ddd.show.code.domain.core.aggr;

import org.springframework.stereotype.Component;

import java.util.List;

import javax.annotation.Resource;

import ddd.base.domain.Aggr;
import ddd.base.domain.DomainFactory;
import ddd.ddd.show.code.domain.core.entity.CourceEntity;
import ddd.ddd.show.code.domain.core.entity.CourceRecordEntity;
import ddd.ddd.show.code.domain.core.entity.StudentEntity;
import ddd.ddd.show.code.domain.core.repository.CourceRecordRepository;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 学生订阅课程聚合
 * author  wenhe
 * date 2019/5/22
 */
@Slf4j
@Setter
@Getter
@Component
public class StudentSubscribeCourceAggr implements Aggr<String> {

  private String studentCode;

  private List<String> courceCodes;

  @Override
  public String getAggrRoot() {
    return studentCode;
  }

//  private StudentEntity student;
//
//  private List<CourceEntity> cources;
//
//  @Override
//  public StudentEntity getAggrRoot() {
//    return student;
//  }

  //为了演示，这种一种错误的注入
  @Resource
  private CourceRecordRepository courceRecordRepository;

  /**
   * 生成课程记录
   */
  public void createCourceByStudent() {
    //得到学生实体，实体里面会校验学生的合法性，此处不需要判空
    StudentEntity studentEntity = StudentEntity.get().getByCode(getAggrRoot());
    //得到所有课程聚合，课程实体里面会对课程合法性进行校验
    List<CourceEntity> cources = CourceEntity.get().getByCodes(getCourceCodes());
    //创建该学生选课记录
    List<CourceRecordEntity> courceRecords = buildCourceRecords(studentEntity,cources);
    courceRecordRepository.batchInsert(courceRecords);
  }

  /**
   * 通过学生构造选择的课程,并把课程落库
   * 推荐示例
   */
  public void createCourceByStudentAdvise() {
    //得到学生实体，实体里面会校验学生的合法性，此处不需要判空
    StudentEntity studentEntity = StudentEntity.get().getByCode(getAggrRoot());
    //得到所有课程聚合，课程实体里面会对课程合法性进行校验
    List<CourceEntity> cources = CourceEntity.get().getByCodes(getCourceCodes());
    //创建该学生选课记录
    List<CourceRecordEntity> courceRecords = buildCourceRecords(studentEntity,cources);
    //使用实体的能力去持久化
    CourceRecordEntity.get().batchCreate(courceRecords);
  }



  /**
   * 管理学生和课程的关系，直接返回选课记录实体集合
   * 另外一种实现方式
   */
  public List<CourceRecordEntity> buildCourceByStudentAdvise() {
    //得到学生实体，实体里面会校验学生的合法性，此处不需要判空
    StudentEntity studentEntity = StudentEntity.get().getByCode(getAggrRoot());
    //得到所有课程聚合，课程实体里面会对课程合法性进行校验
    List<CourceEntity> cources = CourceEntity.get().getByCodes(getCourceCodes());
    //创建该学生选课记录
    List<CourceRecordEntity> courceRecords = buildCourceRecords(studentEntity,cources);
    return courceRecords;
  }

  /**
   * 根据学生查询订阅的课程
   */
  public List<CourceEntity> queryCourceByStudent() {
    StudentEntity studentEntity = StudentEntity.get();
    CourceEntity courceEntity = CourceEntity.get();
    List<CourceEntity> cources = courceEntity.queryCourceByStudentNo(studentEntity.getUniqueId());
    return cources;
  }


  private List<CourceEntity> build(StudentEntity studentEntity) {
    return null;
  }

  public static final StudentSubscribeCourceAggr get() {
    return DomainFactory.get(StudentSubscribeCourceAggr.class);
  }

  private List<CourceRecordEntity> buildCourceRecords(StudentEntity studentEntity, List<CourceEntity> cources) {
    return null;
  }

}
