package com.daily.project.entity.project;

import com.daily.project.common.Util;
import com.daily.project.entity.common.BaseEntity;
import com.daily.project.enums.project.ProjectEnum;
import com.daily.project.enums.project.ProjectStatusEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="projects")
public class ProjectEntity extends BaseEntity {

    @Column
    private String name;
    //备注
    @Column
    private String remark;
    @Column
    private double goal;
    //目标
    @Column
    private String planGoaldetail;
    //目标
    @Column
    private String realGoaldetail;
    //项目状态
    @Column
    private ProjectStatusEnum projectStatusEnum;
    //cp4标识
    @Column
    private String cp4;
    //项目类型
    @Column
    private ProjectEnum projectEnum;

    private String projectEnumName;
    @Column
    private String projectOwner;
    @Column
    private String projectManager;
    @Column
    private String testManager;
    @Column
    private String developerManager;
    @Column
    private String productManager;
    @Column
    private String demandPerson;
    @Column
    private String projectOwnerId;
    @Column
    private String projectManagerId;
    @Column
    private String testManagerId;
    @Column
    private String developerManagerId;
    @Column
    private String productManagerId;
    @Column
    private String parentId;
    @Column
    private String demandPersonId;
    //需求提出日期
    @Column
    private Date demandDate;
    //立项日期
    @Column
    private Date approvalDate;
    @Column
    private Date prdFinishDate;
    @Column
    private Date prdReviewFinishDate;
    @Column
    private Date designDate;
    @Column
    private Date testDate;
    @Column
    private Date checkDate;
    @Column
    private Date onlineDate;
    @Column
    private Date abTestStartDate;
    @Column
    private Date abTestEndDate;
    @Column
    private Date realTestDate;
    @Column
    private Date realCheckDate;
    @Column
    private Date realOnlineDate;
    @Column
    private Date realABTestStartDate;
    @Column
    private Date realABTestEndDate;
    @Column
    private double workday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public String getPlanGoaldetail() {
        return planGoaldetail;
    }

    public void setPlanGoaldetail(String planGoaldetail) {
        this.planGoaldetail = planGoaldetail;
    }

    public String getRealGoaldetail() {
        return realGoaldetail;
    }

    public void setRealGoaldetail(String realGoaldetail) {
        this.realGoaldetail = realGoaldetail;
    }

    public ProjectStatusEnum getProjectStatusEnum() {
        return projectStatusEnum;
    }

    public void setProjectStatusEnum(ProjectStatusEnum projectStatusEnum) {
        this.projectStatusEnum = projectStatusEnum;
    }

    public String getCp4() {
        return cp4;
    }

    public void setCp4(String cp4) {
        this.cp4 = cp4;
    }

    public ProjectEnum getProjectEnum() {
        return projectEnum;
    }

    public void setProjectEnum(ProjectEnum projectEnum) {
        this.projectEnum = projectEnum;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getTestManager() {
        return testManager;
    }

    public void setTestManager(String testManager) {
        this.testManager = testManager;
    }

    public String getDeveloperManager() {
        return developerManager;
    }

    public void setDeveloperManager(String developerManager) {
        this.developerManager = developerManager;
    }

    public String getProductManager() {
        return productManager;
    }

    public void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    public String getDemandPerson() {
        return demandPerson;
    }

    public void setDemandPerson(String demandPerson) {
        this.demandPerson = demandPerson;
    }

    public String getProjectOwnerId() {
        return projectOwnerId;
    }

    public void setProjectOwnerId(String projectOwnerId) {
        this.projectOwnerId = projectOwnerId;
    }

    public String getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(String projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public String getTestManagerId() {
        return testManagerId;
    }

    public void setTestManagerId(String testManagerId) {
        this.testManagerId = testManagerId;
    }

    public String getDeveloperManagerId() {
        return developerManagerId;
    }

    public void setDeveloperManagerId(String developerManagerId) {
        this.developerManagerId = developerManagerId;
    }

    public String getProductManagerId() {
        return productManagerId;
    }

    public void setProductManagerId(String productManagerId) {
        this.productManagerId = productManagerId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDemandPersonId() {
        return demandPersonId;
    }

    public void setDemandPersonId(String demandPersonId) {
        this.demandPersonId = demandPersonId;
    }

    public Date getDemandDate() {
        return demandDate;
    }

    public void setDemandDate(Date demandDate) {
        this.demandDate = demandDate;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Date getPrdFinishDate() {
        return prdFinishDate;
    }

    public void setPrdFinishDate(Date prdFinishDate) {
        this.prdFinishDate = prdFinishDate;
    }

    public Date getPrdReviewFinishDate() {
        return prdReviewFinishDate;
    }

    public void setPrdReviewFinishDate(Date prdReviewFinishDate) {
        this.prdReviewFinishDate = prdReviewFinishDate;
    }

    public Date getDesignDate() {
        return designDate;
    }

    public void setDesignDate(Date designDate) {
        this.designDate = designDate;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(Date onlineDate) {
        this.onlineDate = onlineDate;
    }

    public Date getAbTestStartDate() {
        return abTestStartDate;
    }

    public void setAbTestStartDate(Date abTestStartDate) {
        this.abTestStartDate = abTestStartDate;
    }

    public Date getAbTestEndDate() {
        return abTestEndDate;
    }

    public void setAbTestEndDate(Date abTestEndDate) {
        this.abTestEndDate = abTestEndDate;
    }

    public Date getRealTestDate() {
        return realTestDate;
    }

    public void setRealTestDate(Date realTestDate) {
        this.realTestDate = realTestDate;
    }

    public Date getRealCheckDate() {
        return realCheckDate;
    }

    public void setRealCheckDate(Date realCheckDate) {
        this.realCheckDate = realCheckDate;
    }

    public Date getRealOnlineDate() {
        return realOnlineDate;
    }

    public void setRealOnlineDate(Date realOnlineDate) {
        this.realOnlineDate = realOnlineDate;
    }

    public Date getRealABTestStartDate() {
        return realABTestStartDate;
    }

    public void setRealABTestStartDate(Date realABTestStartDate) {
        this.realABTestStartDate = realABTestStartDate;
    }

    public Date getRealABTestEndDate() {
        return realABTestEndDate;
    }

    public void setRealABTestEndDate(Date realABTestEndDate) {
        this.realABTestEndDate = realABTestEndDate;
    }

    public double getWorkday() {
        return workday;
    }

    public void setWorkday(double workday) {
        this.workday = workday;
    }

    public String getProjectEnumName() {
        if(!Util.isEmpty(this.projectEnum)){
            return this.projectEnum.getText();
        }
        return null;
    }

}
