package com.example.retrofitapp.bean;

import com.example.retrofitapp.network.BaseResponseBean;

import java.util.List;

/**
 * @author MR.su
 * @time 2022.7.4
 * @describ 主页面的bean
 */
public class MainPageBean  {
        private List<ModuleList> moduleList;
        private List<Subjects> subjects;
        private List<Grades> grades;
        private List<Banners> banners;

        public List<ModuleList> getModuleList() {
            return moduleList;
        }

        public void setModuleList(List<ModuleList> moduleList) {
            this.moduleList = moduleList;
        }

        public List<Subjects> getSubjects() {
            return subjects;
        }

        public void setSubjects(List<Subjects> subjects) {
            this.subjects = subjects;
        }

        public List<Grades> getGrades() {
            return grades;
        }

        public void setGrades(List<Grades> grades) {
            this.grades = grades;
        }

        public List<Banners> getBanners() {
            return banners;
        }

        public void setBanners(List<Banners> banners) {
            this.banners = banners;
        }


}
