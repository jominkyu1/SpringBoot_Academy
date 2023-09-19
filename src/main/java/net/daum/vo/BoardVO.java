package net.daum.vo;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
@Entity //JPA(Java Persistence API) Entity
public class BoardVO { 
	//JPA에서 사용하는 Entity bean 클래스 -> 이 클래스를 통해서 오라클DB에 테이블과 시퀀스가 생성됨

}
