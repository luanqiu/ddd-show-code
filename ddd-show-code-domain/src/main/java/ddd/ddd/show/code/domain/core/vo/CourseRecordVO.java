package ddd.ddd.show.code.domain.core.vo;

import ddd.base.domain.VO;
import lombok.Getter;
import lombok.Setter;

/**
 * 选课记录
 * 记录选生选课的情况
 * 默认学生只能选课一次
 * author  likongpeng
 * date 2019/5/22
 */
@Getter
@Setter
public class CourseRecordVO implements VO {

  private static final long serialVersionUID = -4467487029209784389L;

  /**
   * 学生唯一标识
   */
  private String studentCode;

  /**
   * 课程唯一标识
   */
  private String courceCode;

}
