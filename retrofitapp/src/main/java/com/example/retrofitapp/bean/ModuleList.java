package com.example.retrofitapp.bean;


import java.math.BigDecimal;
import java.util.List;

/**
 * @author MR.su
 * @time 2022.7.4
 * @describe 主页面的列表bean
 */
public  class ModuleList {
    private List<Contents> contents;
    private String moduleName;
    private Integer moduleId;
    private Integer type;
    private String seriesName;
    private int seriesId;

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public List<Contents> getContents() {
        return contents;
    }

    public void setContents(List<Contents> contents) {
        this.contents = contents;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public static class Contents {
        private Integer isBuy;
        private Integer resourceId;
        private Double showPrice;
        private String seriesName;
        private String moduleName;
        private String resourceName;
        private Integer id;
        private Integer type;
        private String subheading;
        private String picture;
        private Integer seriesId;
        private String mainHeading;
        private Integer moduleId;

        public Integer getModuleId() {
            return moduleId;
        }

        public void setModuleId(Integer moduleId) {
            this.moduleId = moduleId;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        private String subjectName;
        public Integer getIsBuy() {
            return isBuy;
        }

        public void setIsBuy(Integer isBuy) {
            this.isBuy = isBuy;
        }

        public Integer getResourceId() {
            return resourceId;
        }

        public void setResourceId(Integer resourceId) {
            this.resourceId = resourceId;
        }

        public String getShowPrice() {
                return new BigDecimal(String.valueOf(showPrice)).stripTrailingZeros().toPlainString();
        }

        public void setShowPrice(Double showPrice) {
            this.showPrice = showPrice;
        }

        public String getSeriesName() {
            return seriesName;
        }

        public void setSeriesName(String seriesName) {
            this.seriesName = seriesName;
        }

        public String getModuleName() {
            return moduleName;
        }

        public void setModuleName(String moduleName) {
            this.moduleName = moduleName;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getSubheading() {
            return subheading;
        }

        public void setSubheading(String subheading) {
            this.subheading = subheading;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public Integer getSeriesId() {
            return seriesId;
        }

        public void setSeriesId(Integer seriesId) {
            this.seriesId = seriesId;
        }

        public String getMainHeading() {
            return mainHeading;
        }

        public void setMainHeading(String mainHeading) {
            this.mainHeading = mainHeading;
        }
    }
}
