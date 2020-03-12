package com.zhang.entity.cluster;

import com.zhang.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name = "yarn_summary")
public class YarnSummary extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int liveNodeManagerNums;
    private int deadNodeManagerNums;
    private int unhealthyNodeManagerNums;
    private int submittedApps;
    private int runningApps;
    private int pendingApps;
    private int completedApps;
    private int killedApps;
    private int failedApps;
    private Long allocatedMem;
    private int allocatedCores;
    private int allocatedContainers;
    private Long availableMem;
    private int availableCores;
    private Long pendingMem;
    private int pendingCores;
    private int pendingContainers;
    private Long reservedMem;
    private int reservedCores;
    private int reservedContainers;
}
