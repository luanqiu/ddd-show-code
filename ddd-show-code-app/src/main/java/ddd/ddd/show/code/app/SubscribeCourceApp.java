package ddd.ddd.show.code.app;

import org.springframework.stereotype.Component;

import java.util.List;

import ddd.base.domain.Application;
import ddd.ddd.show.code.api.common.dto.BaseRequestDTO;
import ddd.ddd.show.code.api.common.dto.BaseResponseDTO;
import ddd.ddd.show.code.domain.core.aggr.StudentSubscribeCourceAggr;
import ddd.ddd.show.code.domain.core.entity.CourceEntity;
import ddd.ddd.show.code.domain.core.entity.CourceRecordEntity;
import ddd.ddd.show.code.domain.core.entity.StudentEntity;

/**
 * 选课流程
 * author  wenhe
 * date 2019/5/22
 */
@Component
public class SubscribeCourceApp implements Application<BaseRequestDTO, BaseResponseDTO> {

  @Override
  public BaseResponseDTO doAction(BaseRequestDTO request) {
    // step1 校验学生合法性
    StudentEntity studentEntity = StudentEntity.get().getByCode(null);
    //运用规则模式校验,规约模式见 DMVP ,代码都是mock

    // step2 校验课程合法性
    List<CourceEntity> courceEntities = CourceEntity.get().getByCodes(null);
    //运用规则模式校验,规约模式见 DMVP ,代码都是mock

    // step3 生成课程记录
    List<CourceRecordEntity> courceRecordEntities = StudentSubscribeCourceAggr.get().
        buildCourceByStudentAdvise();

    // step4 课程记录落库
    CourceRecordEntity.get().batchCreate(courceRecordEntities);

    return null;
  }
}
