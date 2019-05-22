package ddd.ddd.show.code.domain.core.repository;

import java.util.List;

import ddd.ddd.show.code.domain.core.entity.CourceRecordEntity;

/**
* CourceRecordRepository
*author  likongpeng
*date 2019/5/22
*/
public interface CourceRecordRepository {

  int batchInsert(List<CourceRecordEntity> courceRecords);

}
