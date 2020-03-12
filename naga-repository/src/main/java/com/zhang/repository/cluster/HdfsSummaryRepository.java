package com.zhang.repository.cluster;

import com.zhang.entity.cluster.HdfsSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HdfsSummaryRepository extends JpaRepository<HdfsSummary, Long> {
    HdfsSummary findTop1ByIsTrashFalseAndCreateTimeLessThanEqualOrderByCreateTimeDesc(Integer selectTime);

    List<HdfsSummary> findByIsTrashFalseAndCreateTimeBetweenOrderByCreateTimeAsc(Integer startTime, Integer endTime);

}
