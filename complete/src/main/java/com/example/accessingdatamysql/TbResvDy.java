package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbResvDy {

        private Integer resvCnt;
        public Integer getResvCnt() {
                return resvCnt;
        }
        public void setResvCnt(Integer resvCnt) {
                this.resvCnt = resvCnt;
        }

        private Integer allCnt;
        public Integer getAllCnt() {
                return allCnt;
        }
        public void setAllCnt(Integer allCnt) {
                this.allCnt = allCnt;
        }

	@Id
        private String resvDy;
        public String getResvDy() {
                return resvDy;
        }
        public void setResvDy(String resvDy) {
                this.resvDy = resvDy;
        }
}

