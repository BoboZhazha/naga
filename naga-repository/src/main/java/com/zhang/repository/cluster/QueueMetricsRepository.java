package com.zhang.repository.cluster;

import com.zhang.entity.cluster.QueueMetrics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueueMetricsRepository extends JpaRepository<QueueMetrics, Long> {
    List<QueueMetrics> findByCreateTime(Integer selectTime);
}
