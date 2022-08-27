//package com.example.demo.wrapper;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
////import com.google.common.collect.Lists;
////import com.google.common.collect.Sets;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.Accessors;
//
//import java.sql.Timestamp;
//import java.util.List;
//import java.util.Set;
//@Data
//@NoArgsConstructor
//@Accessors(chain = true)
//@JsonInclude(Include.NON_NULL)
//public class ServiceInfoDTO implements ServiceInfoDetail, MisInfoDetail {
//
//  private String trackedId;
//  private Long sourceId;
//  private Long serviceId;
//  private String serviceName;
//  private String email;
//  private Integer status;
//  private String sourceType;
//  private String sourceTableName;
//  private Long topicId;
//  private String topicName;
//  private Long storageId;
//  private String storageSchemaTable;
//  private String misInfo;
//  private Long createdTransAt;
//  private String failedAt;
//  private String log;
//  private Timestamp createdAt;
//
//  private List<BaseInfo> topicInfo = Lists.newArrayList();
//  private List<BaseInfo> storageInfo = Lists.newArrayList();
//  private Set<FailedAtType> failedAts = Sets.newHashSet();
//  private List<Long> sourceIds = Lists.newArrayList();
//  private List<String> sourceNames = Lists.newArrayList();
//  private List<String> logName = Lists.newArrayList();
//
//  public static ServiceInfoDTO build() {
//    return new ServiceInfoDTO();
//  }
//
//  public ServiceInfoDTO(String trackedId, String failedAt) {
//    this.trackedId = trackedId;
//    this.failedAt = failedAt;
//  }
//
//  public ServiceInfoDTO(String serviceName, String trackedId, String logName, String misInfo, String failedAt, Timestamp createdAt) {
//    this.serviceName = serviceName;
//    this.trackedId = trackedId;
//    this.logName.add(logName);
//    this.misInfo = misInfo;
//    this.failedAt = failedAt;
//    this.createdAt = createdAt;
//  }
//
//  public ServiceInfoDTO(String serviceName, String trackedId, String logName, String misInfo, Integer status, String failedAt, Timestamp createdAt) {
//    this.serviceName = serviceName;
//    this.trackedId = trackedId;
//    this.logName.add(logName);
//    this.misInfo = misInfo;
//    this.status = status;
//    this.failedAt = failedAt;
//    this.createdAt = createdAt;
//  }
//
//  public ServiceInfoDTO(Long serviceId, String serviceName, String logName) {
//    this.serviceId = serviceId;
//    this.serviceName = serviceName;
//    this.logName.add(logName);
//  }
//
//  public ServiceInfoDTO(String trackedId, String logName, String misInfo, String failedAt, Timestamp createdAt) {
//    this.trackedId = trackedId;
//    this.logName.add(logName);
//    this.misInfo = misInfo;
//    this.failedAt = failedAt;
//    this.createdAt = createdAt;
//  }
//
//  public ServiceInfoDTO(String trackedId, String sourceTableName, Long topicId, String topicName,
//      Long storageId, String storageSchemaTable, Long createdTransAt, String misInfo) {
//    this.trackedId = trackedId;
//    this.sourceTableName = sourceTableName;
//    this.topicId = topicId;
//    this.topicName = topicName;
//    this.storageId = storageId;
//    this.storageSchemaTable = storageSchemaTable;
//    this.createdTransAt = createdTransAt;
//    this.misInfo = misInfo;
//
//    addTopicInfo(BaseInfo.build().setId(getTopicId()).setName(getTopicName()));
//    addStorageInfo(BaseInfo.build().setId(getStorageId()).setName(getStorageSchemaTable()));
//  }
//
//  public ServiceInfoDTO(String trackedId, String sourceTableName, Long topicId, String topicName,
//                        Long storageId, String storageSchemaTable, Long createdTransAt, String misInfo, String failedAt) {
//    this.trackedId = trackedId;
//    this.sourceTableName = sourceTableName;
//    this.topicId = topicId;
//    this.topicName = topicName;
//    this.storageId = storageId;
//    this.storageSchemaTable = storageSchemaTable;
//    this.createdTransAt = createdTransAt;
//    this.misInfo = misInfo;
//    this.failedAt = failedAt;
//
//    addTopicInfo(BaseInfo.build().setId(getTopicId()).setName(getTopicName()));
//    addStorageInfo(BaseInfo.build().setId(getStorageId()).setName(getStorageSchemaTable()));
//  }
//
//  public ServiceInfoDTO(String serviceName, String trackedId, String sourceTableName, Long topicId, String topicName,
//                        Long storageId, String storageSchemaTable, Integer status, Long createdTransAt, String misInfo, String failedAt) {
//    this.serviceName = serviceName;
//    this.trackedId = trackedId;
//    this.sourceTableName = sourceTableName;
//    this.topicId = topicId;
//    this.topicName = topicName;
//    this.storageId = storageId;
//    this.storageSchemaTable = storageSchemaTable;
//    this.createdTransAt = createdTransAt;
//    this.misInfo = misInfo;
//    this.failedAt = failedAt;
//    this.status = status;
//  }
//
//  public ServiceInfoDTO(Long sourceId, Long serviceId, String serviceName, String email,
//      Integer status, String sourceType, String sourceTableName, Long topicId,
//      String topicName, Long storageId, String storageSchemaTable) {
//    this.sourceId = sourceId;
//    this.serviceId = serviceId;
//    this.serviceName = serviceName;
//    this.email = email;
//    this.status = status;
//    this.sourceType = sourceType;
//    this.sourceTableName = sourceTableName;
//    this.topicId = topicId;
//    this.topicName = topicName;
//    this.storageId = storageId;
//    this.storageSchemaTable = storageSchemaTable;
//  }
//
//  public ServiceInfoDTO addTopicInfo(BaseInfo info) {
//    this.topicInfo.add(info);
//    return this;
//  }
//
//  public ServiceInfoDTO addStorageInfo(BaseInfo info) {
//    this.storageInfo.add(info);
//    return this;
//  }
//
//  public ServiceInfoDTO addSourceIds(Long info) {
//    this.sourceIds.add(info);
//    return this;
//  }
//
//  public ServiceInfoDTO addSourceNames(String info) {
//    this.sourceNames.add(info);
//    return this;
//  }
//
//  public ServiceInfoDTO addLogName(String logName) {
//    this.logName.add(logName);
//    return this;
//  }
//
//  public StateType getStatus() {
//    return StateType.fromCode(this.status);
//  }
//
//  @Override
//  public Integer getStatusCode() {
//    return this.status;
//  }
//
//  @Override
//  public ServiceInfoDTO setStatus(Integer status) {
//    this.status = status;
//    return this;
//  }
//
//  @Override
//  public String getFailedAt() {
//    return this.failedAt;
//  }
//
//}
