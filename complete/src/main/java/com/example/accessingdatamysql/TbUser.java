package com.example.accessingdatamysql;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class TbUser {

        @Id
        private String mbno;
        public String getMbno() {
                return mbno;
        }
        public void setMbno(String mbno) {
                this.mbno = mbno;
        }

	private String name;
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }

        private String resvDy;
        public String getResvDy() {
                return resvDy;
        }
        public void setResvDy(String resvDy) {
                this.resvDy = resvDy;
        }

        private LocalDateTime localDateTime;
        public LocalDateTime getLocalDateTime() {
                return localDateTime;
        }
        public void setLocalDateTime(LocalDateTime localDateTime) {
                this.localDateTime = localDateTime;
        }
}

